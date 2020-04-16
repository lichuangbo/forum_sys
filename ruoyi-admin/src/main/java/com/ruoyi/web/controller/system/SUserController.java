package com.ruoyi.web.controller.system;

import java.util.Date;
import java.util.List;

import com.ruoyi.system.domain.SysRole;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SUser;
import com.ruoyi.system.service.ISUserService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统用户Controller
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
//@Controller
//@RequestMapping("/system/user")
public class SUserController extends BaseController
{
    private String prefix = "system/user";

    @Autowired
    private ISUserService sUserService;

    @RequiresPermissions("system:user:view")
    @GetMapping()
    public String user()
    {
        return prefix + "/user";
    }

    /**
     * 查询系统用户列表
     */
    @RequiresPermissions("system:user:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SUser sUser)
    {
        startPage();
        List<SUser> list = sUserService.selectSUserList(sUser);
        return getDataTable(list);
    }

    /**
     * 导出系统用户列表
     */
    @RequiresPermissions("system:user:export")
    @Log(title = "系统用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SUser sUser)
    {
        List<SUser> list = sUserService.selectSUserList(sUser);
        ExcelUtil<SUser> util = new ExcelUtil<SUser>(SUser.class);
        return util.exportExcel(list, "user");
    }

    /**
     * 新增系统用户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存系统用户
     */
    @RequiresPermissions("system:user:add")
    @Log(title = "系统用户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SUser sUser)
    {
        sUser.setGmtCreate(new Date());
        return toAjax(sUserService.insertSUser(sUser));
    }

    /**
     * 修改系统用户
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SUser sUser = sUserService.selectSUserById(id);
        mmap.put("sUser", sUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存系统用户
     */
    @RequiresPermissions("system:user:edit")
    @Log(title = "系统用户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SUser sUser)
    {
        return toAjax(sUserService.updateSUser(sUser));
    }

    /**
     * 删除系统用户
     */
    @RequiresPermissions("system:user:remove")
    @Log(title = "系统用户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sUserService.deleteSUserByIds(ids));
    }

    /**
     * 用户禁用状态修改
     */
    @Log(title = "系统用户", businessType = BusinessType.UPDATE)
    @RequiresPermissions("system:user:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(SUser sUser)
    {
        return toAjax(sUserService.updateSUser(sUser));
    }
}
