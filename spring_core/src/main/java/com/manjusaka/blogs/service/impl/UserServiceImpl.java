package com.manjusaka.blogs.service.impl;

import com.manjusaka.blogs.dao.userdao.UserDao;
import com.manjusaka.blogs.exception.BlogsDataBaseException;
import com.manjusaka.blogs.exception.BlogsException;
import com.manjusaka.blogs.model.result.Status;
import com.manjusaka.blogs.model.statusenum.StatusEnum;
import com.manjusaka.blogs.model.user.UserDO;
import com.manjusaka.blogs.service.UserService;
import com.manjusaka.blogs.util.ResultUtil;
import com.manjusaka.blogs.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * description:
 * ===>用户业务接口实现类，处理用户相关业务逻辑
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 10:00
 * @version V1.0.0
 */
@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    /**
     * 时间格式
     */
    private final static String DATEFORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 用户登录业务逻辑处理接口实现方法
     *
     * @param userName <code>用户名</code>
     * @param passWord <code>密码</code>
     * @return <code>T</code>
     * @throws BlogsException <code>程序出现异常处理信息</code>
     */
    @Override
    public <T> T userLoginService(String userName, String passWord) throws BlogsException {
        UserDO data = null;
        try {
            ValueOperations<String, Object> so = this.redisTemplate.opsForValue();
            data = (UserDO) so.get(userName);
            if (null == data) {
                data = this.dao.userLoginDao(userName, passWord);
                if (data != null) {
                    setUserToRedis(data);
                }
            }
        } catch (RuntimeException e) {
            throw new BlogsDataBaseException("sql执行异常!" + ":" + e.getMessage(), e.getCause());
        }
        if (data != null) {
            return (T) ResultUtil.result(StatusEnum.SUCCESS.getCODE(), data);
        }
        return (T) ResultUtil.status(StatusEnum.NO_USER.getCODE(), StatusEnum.NO_USER.getEXPLAIN());
    }

    /**
     * 用户注册业务逻辑处理接口实现方法
     *
     * @param userDO <code>用户信息</code>
     * @return <code>Status</code>
     * @throws BlogsException <code>程序出现异常处理信息</code>
     */
    @Override
    public Status userRegisterService(UserDO userDO) throws BlogsException {
        int status = 0;
        String date = DateTimeFormatter.ofPattern(DATEFORMAT).format(LocalDateTime.now());
        userDO.setUid(UUIDUtil.getUUID().toString());
        userDO.setCreateTime(date);
        userDO.setEditTime(date);
        try {
            status = this.dao.userRegisterDao(userDO);
        } catch (RuntimeException e) {
            throw new BlogsDataBaseException("sql语句执行异常！" + ":" + e.getMessage(), e.getCause());
        }
        if (status > 0) {
            setUserToRedis(userDO);
            return ResultUtil.status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
        }
        return ResultUtil.status(StatusEnum.DEFEAT.getCODE(), StatusEnum.DEFEAT.getEXPLAIN());
    }

    private void setUserToRedis(UserDO user) {
        ValueOperations<String, Object> vo = this.redisTemplate.opsForValue();
        vo.set(user.getUserName(), user);
    }
}
