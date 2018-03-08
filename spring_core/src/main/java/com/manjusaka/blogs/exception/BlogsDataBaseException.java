package com.manjusaka.blogs.exception;

/**
 * description:
 * ===>系统访问数据库异常封装类
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 14:27
 * @version V1.0.0
 */
public class BlogsDataBaseException extends RuntimeException {

    private static final long serialVersionUID = 6472513404477125985L;

    public BlogsDataBaseException() {
        super();
    }

    public BlogsDataBaseException(String message) {
        super(message);
    }

    public BlogsDataBaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
