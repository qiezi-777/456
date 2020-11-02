package com.yg.pojo;

import java.util.Date;

public class User {
    private int id;//用户id
    private String username;//用户名
    private String password;//密码
    private int role;//角色  1:管理员用户  2：普通用户
    private String mobile;//电话
    private String email;//邮箱
    private Date regtime;//注册时间
    private Date updatetime;//更新时间
    private Date deletetime;//删除时间
    private int userstatus;//用户状态  1：正常 2：删除
    //有参构造方法
    public User(int id, String username, String password, int role,
                String mobile, String email, Date regtime, Date updatetime,
                Date deletetime, int userstatus) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.mobile = mobile;
        this.email = email;
        this.regtime = regtime;
        this.updatetime = updatetime;
        this.deletetime = deletetime;
        this.userstatus = userstatus;
    }
    //无参构造方法
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getRegtime() {
        return regtime;
    }
    public void setRegtime(Date retime) {
        this.regtime = retime;
    }
    public Date getUpdatetime() {
        return updatetime;
    }
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
    public Date getDeletetime() {
        return deletetime;
    }
    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }
    public int getUserstatus() {
        return userstatus;
    }
    public void setUserstatus(int userstatus) {
        this.userstatus = userstatus;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + ", role=" + role + ", mobile=" + mobile
                + ", email=" + email + ", regtime=" + regtime + ", updatetime="
                + updatetime + ", deletetime=" + deletetime + ", userstatus="
                + userstatus + "]";
    }

}
