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
import com.ruoyi.system.domain.SMenu;
import com.ruoyi.system.service.ISMenuService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统菜单Controller
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
//@Controller
//@RequestMapping("/system/menu")
public class SMenuController extends BaseController
{
    private String prefix = "system/menu";

    @Autowired
    private ISMenuService sMenuService;

    @RequiresPermissions("system:menu:view")
    @GetMapping()
    public String menu()
    {
        return prefix + "/menu";
    }

    /**
     * 查询系统菜单列表
     */
    @RequiresPermissions("system:menu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SMenu sMenu)
    {
        startPage();
        List<SMenu> list = sMenuService.selectSMenuList(sMenu);
        return getDataTable(list);
    }

    /**
     * 导出系统菜单列表
     */
    @RequiresPermissions("system:menu:export")
    @Log(title = "系统菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SMenu sMenu)
    {
        List<SMenu> list = sMenuService.selectSMenuList(sMenu);
        ExcelUtil<SMenu> util = new ExcelUtil<SMenu>(SMenu.class);
        return util.exportExcel(list, "menu");
    }

    /**
     * 新增系统菜单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存系统菜单
     */
    @RequiresPermissions("system:menu:add")
    @Log(title = "系统菜单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SMenu sMenu)
    {
        return toAjax(sMenuService.insertSMenu(sMenu));
    }

    /**
     * 修改系统菜单
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SMenu sMenu = sMenuService.selectSMenuById(id);
        mmap.put("sMenu", sMenu);
        return prefix + "/edit";
    }

    /**
     * 修改保存系统菜单
     */
    @RequiresPermissions("system:menu:edit")
    @Log(title = "系统菜单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SMenu sMenu)
    {
        return toAjax(sMenuService.updateSMenu(sMenu));
    }

    /**
     * 删除系统菜单
     */
    @RequiresPermissions("system:menu:remove")
    @Log(title = "系统菜单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sMenuService.deleteSMenuByIds(ids));
    }
}
