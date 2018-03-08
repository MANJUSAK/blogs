package com.manjusaka.blogs.exception;

/**
 * description:
 * ===>系统业务异常封装处理类
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 14:29
 * @version V1.0.0
 */
public class BlogsApplicationException extends RuntimeException {

    private static final long serialVersionUID = 2915195718262235890L;

    public BlogsApplicationException(String message) {
        super(message);
    }

    public BlogsApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogsApplicationException(Throwable cause) {
        super(cause);
    }
}
