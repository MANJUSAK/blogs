package com.manjusaka.blogs.model.user;

import com.manjusaka.blogs.model.base.BaseDO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * description:
 * ===>用户实体
 * company：
 *
 * @author manjusaka[manjusakachn@gmail.com] Created on 2018-03-06 10:07
 * @version V1.0.0
 */
public class UserDO extends BaseDO {
    private static final long serialVersionUID = -555266883026451553L;
    private String uid;
    private String userName;
    private String passWord;
    private String age = "0";
    private String gender = "0";
    private String fileId = "0";
    private String tel = "0";

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserDO)) {
            return false;
        }
        UserDO userDO = (UserDO) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(uid, userDO.uid)
                .append(userName, userDO.userName)
                .append(passWord, userDO.passWord)
                .append(age, userDO.age)
                .append(gender, userDO.gender)
                .append(fileId, userDO.fileId)
                .append(tel, userDO.tel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(uid)
                .append(userName)
                .append(passWord)
                .append(age)
                .append(gender)
                .append(fileId)
                .append(tel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("uid", uid)
                .append("userName", userName)
                .append("passWord", passWord)
                .append("age", age)
                .append("gender", gender)
                .append("fileId", fileId)
                .append("tel", tel)
                .toString();
    }
}
