package com.manjusaka.blogs.dao.userdao;

import com.manjusaka.blogs.model.user.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * description:
 * ===>用户数据持久化dao层接口，用户保存用户数据到数据库
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 10:02
 * @version V1.0.0
 */
@Repository
public interface UserDao {

    /**
     * 用户登录获取用户数据dao接口
     *
     * @param userName <code>用户名</code>
     * @param passWord <code>密码</code>
     * @return <code>userDO</code>
     * @throws RuntimeException sql执行异常
     */
    UserDO userLoginDao(@Param("uName") String userName, @Param("pwd") String passWord) throws RuntimeException;

    /**
     * 用户注册数据保存dao接口
     *
     * @return <code>0</code>或<code>1</code>
     * @throws RuntimeException sql执行异常
     */
    int userRegisterDao(UserDO userDO) throws RuntimeException;

}
