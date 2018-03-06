package com.manjusaka.blogs.model.result;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * description:
 * ===>返回结果集实体
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com]
 * @version v1.1.0
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -2828998968005589782L;
    /**
     * 状态码
     */
    private int errorCode;
    /**
     * 返回数据
     */
    private Object data;

    public Result() {
        super();
    }

    public Result(int errorCode, Object data) {
        super();
        this.errorCode = errorCode;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Result)) {
            return false;
        }
        Result result = (Result) o;
        return new EqualsBuilder()
                .append(errorCode, result.errorCode)
                .append(data, result.data)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(errorCode)
                .append(data)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("errorCode", errorCode)
                .append("data", data)
                .toString();
    }
}
