package com.manjusaka.blogs.model.user;

import com.manjusaka.blogs.model.base.BaseDO;

import java.util.Objects;

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
        if (!super.equals(o)) {
            return false;
        }
        UserDO userDO = (UserDO) o;
        return Objects.equals(uid, userDO.uid) &&
                Objects.equals(userName, userDO.userName) &&
                Objects.equals(passWord, userDO.passWord) &&
                Objects.equals(age, userDO.age) &&
                Objects.equals(gender, userDO.gender) &&
                Objects.equals(fileId, userDO.fileId) &&
                Objects.equals(tel, userDO.tel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), uid, userName, passWord, age, gender, fileId, tel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDO{");
        sb.append("uid='").append(uid).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", passWord='").append(passWord).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", fileId='").append(fileId).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
