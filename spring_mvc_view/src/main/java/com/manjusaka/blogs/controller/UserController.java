package com.manjusaka.blogs.controller;

import com.manjusaka.blogs.model.result.Status;
import com.manjusaka.blogs.model.statusenum.StatusEnum;
import com.manjusaka.blogs.model.user.UserDO;
import com.manjusaka.blogs.service.UserService;
import com.manjusaka.blogs.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:
 * ===>用户访问接口处理、视图处理业务类
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 9:45
 * @version V1.0.0
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;


    /**
     * 用户登录接口
     *
     * @param userName <code>用户名</code>
     * @param passWord <code>密码</code>
     * @param <T>      <code>泛型指数</code>
     * @return <code>T</code>
     */
    @GetMapping("/login.htm")
    public <T> T userLoginController(@RequestParam String userName, @RequestParam String passWord) {
        try {
            return this.service.userLoginService(userName, passWord);
        } catch (Exception e) {
            e.printStackTrace();
            return (T) ResultUtil.status(StatusEnum.DATABASE_ERROR.getCODE(), StatusEnum.DATABASE_ERROR.getEXPLAIN());
        }

    }

    /**
     * 用户注册接口
     *
     * @param userDO <code>用户数据</code>
     * @return <code>Status</code>
     */
    @PostMapping("register.htm")
    public Status userRegisterController(UserDO userDO) {
        try {
            return this.service.userRegisterService(userDO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.status(StatusEnum.DATABASE_ERROR.getCODE(), StatusEnum.DATABASE_ERROR.getEXPLAIN());
        }
    }
}
