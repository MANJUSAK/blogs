package com.manjusaka.blogs.util;

import com.manjusaka.blogs.model.result.Result;
import com.manjusaka.blogs.model.result.Status;

/**
 * description:
 * ===>结果集封装工具类
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 14:52
 * @version V1.0.0
 */
public class ResultUtil {
    private static Result result = new Result();
    private static Status status = new Status();

    /**
     * 用于查询数据返回结果集封装方法
     *
     * @param errorCode <code>状态码</code>
     * @param data      <code>数据</code>
     * @return <code>Result</code>
     */
    public static Result result(int errorCode, Object data) {
        result.setErrorCode(errorCode);
        result.setData(data);
        return result;
    }

    /**
     * 用于提示性业务方法返回结果封装方法
     *
     * @param errorCode <code>状态码</code>
     * @param msg       <code>描述</code>
     * @return <code>Result</code>
     */
    public static Status status(int errorCode, String msg) {
        status.setErrorCode(errorCode);
        status.setMsg(msg);
        return status;
    }
}
