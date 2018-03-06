package com.manjusaka.blogs.service;

import com.manjusaka.blogs.model.result.Status;
import com.manjusaka.blogs.model.user.UserDO;
import com.manjusaka.blogs.service.exception.BlogsException;

/**
 * description:
 * ===>用户业务接口，处理用户相关业务逻辑接口
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 9:57
 * @version V1.0.0
 */
public interface UserService {
    /**
     * 用户登录业务逻辑处理接口
     *
     * @param userName <code>用户名</code>
     * @param passWord <code>密码</code>
     * @param <T>      <code>泛型指数</code>
     * @return <code>T</code>
     * @throws BlogsException <code>程序出现异常处理信息</code>
     */
    <T> T userLoginService(String userName, String passWord) throws BlogsException;

    /**
     * 用户注册业务逻辑处理接口
     *
     * @param userDO <code>用户信息</code>
     * @return <code>Status</code>
     * @throws BlogsException <code>程序出现异常处理信息</code>
     */
    Status userRegisterService(UserDO userDO) throws BlogsException;
}
