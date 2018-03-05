package com.hankal.miaosha.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import com.hankal.miaosha.validator.IsMobile;

/**
 * Created by yegang5211 on 2018/2/10.
 */
public class LoginVo {
    @NotNull
    @IsMobile
    private String mobile;

    @NotNull
    @Length(min=32)
    private String password;

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "LoginVo [mobile=" + mobile + ", password=" + password + "]";
    }
}
