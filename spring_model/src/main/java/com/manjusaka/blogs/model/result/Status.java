package com.manjusaka.blogs.model.result;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * description:
 * ===>状态信息提示返回结果集实体
 * <p>
 *
 * @author manjusaka[manjusakachn@gmail.com]
 * @version v1.1.0
 * @date 2017.06.19
 */
public class Status implements Serializable {
    private static final long serialVersionUID = 8179717412450576971L;
    /**
     * 状态码
     */
    private int errorCode;
    /**
     * 状态码描述
     */
    private String msg;

    public Status() {
    }

    public Status(int errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Status)) {
            return false;
        }
        Status status = (Status) o;
        return new EqualsBuilder()
                .append(errorCode, status.errorCode)
                .append(msg, status.msg)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(errorCode)
                .append(msg)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("errorCode", errorCode)
                .append("msg", msg)
                .toString();
    }
}
