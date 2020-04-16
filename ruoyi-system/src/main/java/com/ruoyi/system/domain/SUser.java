package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 系统用户对象 s_user
 *
 * @author ruoyi
 * @date 2020-04-15
 */
public class SUser extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;

    @Excel(name = "用户昵称")
    private String username;

    @Excel(name = "用户真实姓名")
    private String realname;

    private String password;

    private String salt;

    private String avatarUrl;

    @Excel(name = "用户角色", readConverterExp = "0=管理员,1=超级管理员")
    private String role;

    @Excel(name = "是否禁用", readConverterExp = "0=禁用,1=未禁用")
    private String disabled;

    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date gmtCreate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRealname() {
        return realname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public boolean isAdmin()
    {
        return isAdmin(this.id);
    }

    public static boolean isAdmin(Long userId)
    {
        return userId != null && 1L == userId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    @Override
    public String toString() {
        return "SUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", role='" + role + '\'' +
                ", disabled='" + disabled + '\'' +
                ", gmtCreate=" + gmtCreate +
                '}';
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
