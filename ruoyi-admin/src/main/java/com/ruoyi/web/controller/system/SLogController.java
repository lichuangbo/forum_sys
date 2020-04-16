package com.ruoyi.web.controller.system;

import java.util.List;
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
import com.ruoyi.system.domain.SLog;
import com.ruoyi.system.service.ISLogService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统登录日志Controller
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
//@Controller
//@RequestMapping("/system/log")
public class SLogController extends BaseController
{
    private String prefix = "system/log";

    @Autowired
    private ISLogService sLogService;

    @RequiresPermissions("system:log:view")
    @GetMapping()
    public String log()
    {
        return prefix + "/log";
    }

    /**
     * 查询系统登录日志列表
     */
    @RequiresPermissions("system:log:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SLog sLog)
    {
        startPage();
        List<SLog> list = sLogService.selectSLogList(sLog);
        return getDataTable(list);
    }

    /**
     * 导出系统登录日志列表
     */
    @RequiresPermissions("system:log:export")
    @Log(title = "系统登录日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SLog sLog)
    {
        List<SLog> list = sLogService.selectSLogList(sLog);
        ExcelUtil<SLog> util = new ExcelUtil<SLog>(SLog.class);
        return util.exportExcel(list, "log");
    }

    /**
     * 新增系统登录日志
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存系统登录日志
     */
    @RequiresPermissions("system:log:add")
    @Log(title = "系统登录日志", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SLog sLog)
    {
        return toAjax(sLogService.insertSLog(sLog));
    }

    /**
     * 修改系统登录日志
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SLog sLog = sLogService.selectSLogById(id);
        mmap.put("sLog", sLog);
        return prefix + "/edit";
    }

    /**
     * 修改保存系统登录日志
     */
    @RequiresPermissions("system:log:edit")
    @Log(title = "系统登录日志", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SLog sLog)
    {
        return toAjax(sLogService.updateSLog(sLog));
    }

    /**
     * 删除系统登录日志
     */
    @RequiresPermissions("system:log:remove")
    @Log(title = "系统登录日志", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sLogService.deleteSLogByIds(ids));
    }
}
