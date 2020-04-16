package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 系统菜单对象 s_menu
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
public class SMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 菜单名称 */
    @Excel(name = "菜单名称")
    private String menuName;

    /** 父级ID */
    @Excel(name = "父级ID")
    private Long parentId;

    /** 菜单排序号 */
    @Excel(name = "菜单排序号")
    private Long orderNum;

    /** 访问路径 */
    @Excel(name = "访问路径")
    private String url;

    /** 菜单类型 */
    @Excel(name = "菜单类型")
    private Long menuType;

    /** 访问路径 */
    @Excel(name = "访问路径")
    private String perms;

    /** 菜单图标 */
    @Excel(name = "菜单图标")
    private String icon;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMenuName(String menuName) 
    {
        this.menuName = menuName;
    }

    public String getMenuName() 
    {
        return menuName;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setOrderNum(Long orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Long getOrderNum() 
    {
        return orderNum;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setMenuType(Long menuType) 
    {
        this.menuType = menuType;
    }

    public Long getMenuType() 
    {
        return menuType;
    }
    public void setPerms(String perms) 
    {
        this.perms = perms;
    }

    public String getPerms() 
    {
        return perms;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("menuName", getMenuName())
            .append("parentId", getParentId())
            .append("orderNum", getOrderNum())
            .append("url", getUrl())
            .append("menuType", getMenuType())
            .append("perms", getPerms())
            .append("icon", getIcon())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
