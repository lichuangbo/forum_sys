package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 系统登录日志对象 s_log
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
public class SLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 日志记录ID */
    private Long id;

    /** 用户真实姓名 */
    @Excel(name = "用户真实姓名")
    private String loginName;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String ipaddr;

    /** 浏览器 */
    @Excel(name = "浏览器")
    private String browser;

    /** 操作系统 */
    @Excel(name = "操作系统")
    private String os;

    /** 登录时间 */
    @Excel(name = "登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date loginTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLoginName(String loginName) 
    {
        this.loginName = loginName;
    }

    public String getLoginName() 
    {
        return loginName;
    }
    public void setIpaddr(String ipaddr) 
    {
        this.ipaddr = ipaddr;
    }

    public String getIpaddr() 
    {
        return ipaddr;
    }
    public void setBrowser(String browser) 
    {
        this.browser = browser;
    }

    public String getBrowser() 
    {
        return browser;
    }
    public void setOs(String os) 
    {
        this.os = os;
    }

    public String getOs() 
    {
        return os;
    }
    public void setLoginTime(Date loginTime) 
    {
        this.loginTime = loginTime;
    }

    public Date getLoginTime() 
    {
        return loginTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("loginName", getLoginName())
            .append("ipaddr", getIpaddr())
            .append("browser", getBrowser())
            .append("os", getOs())
            .append("loginTime", getLoginTime())
            .toString();
    }
}
