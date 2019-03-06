package com.xzj.achievementshop.model;

import org.apache.tomcat.util.modeler.BaseModelMBean;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 15:02 2019/2/26
 */
public class User extends BaseModel {
    private String userName;
    private String passWord;
    private int totalCoin;

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

    public int getTotalCoin() {
        return totalCoin;
    }

    public void setTotalCoin(int totalCoin) {
        this.totalCoin = totalCoin;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
