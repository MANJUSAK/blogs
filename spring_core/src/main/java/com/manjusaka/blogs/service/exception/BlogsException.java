package com.manjusaka.blogs.service.exception;

/**
 * description:
 * ===>系统异常封装处理类
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 14:32
 * @version V1.0.0
 */
public class BlogsException extends Exception {

    private static final long serialVersionUID = -6479367093410787392L;

    public BlogsException() {
        super();
    }

    public BlogsException(String message) {
        super(message);
    }

    public BlogsException(String message, Throwable cause) {
        super(message, cause);
    }
}
