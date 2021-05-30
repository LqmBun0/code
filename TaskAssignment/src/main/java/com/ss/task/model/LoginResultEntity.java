package com.ss.task.model;

/**
 * Created by Steven Tang on 2015/9/27.
 */
public class LoginResultEntity {
    private String result;
    private String realName;

    public String getResult() {return result;};

    public void setResult(String result) {this.result = result;}

    public String getRealName() {return realName;}

    public void setRealName(String realName) {this.realName = realName;}

    @Override
    public String toString() {
        return "LoginResultEntity{" +
                "result=" + result +
                ", realname='" + realName + '\'' +
                '}';
    }
}
