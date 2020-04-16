package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SMenu;

/**
 * 系统菜单Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
public interface SMenuMapper 
{
    /**
     * 查询系统菜单
     * 
     * @param id 系统菜单ID
     * @return 系统菜单
     */
    public SMenu selectSMenuById(Long id);

    /**
     * 查询系统菜单列表
     * 
     * @param sMenu 系统菜单
     * @return 系统菜单集合
     */
    public List<SMenu> selectSMenuList(SMenu sMenu);

    /**
     * 新增系统菜单
     * 
     * @param sMenu 系统菜单
     * @return 结果
     */
    public int insertSMenu(SMenu sMenu);

    /**
     * 修改系统菜单
     * 
     * @param sMenu 系统菜单
     * @return 结果
     */
    public int updateSMenu(SMenu sMenu);

    /**
     * 删除系统菜单
     * 
     * @param id 系统菜单ID
     * @return 结果
     */
    public int deleteSMenuById(Long id);

    /**
     * 批量删除系统菜单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSMenuByIds(String[] ids);
}
