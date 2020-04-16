package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SMenuMapper;
import com.ruoyi.system.domain.SMenu;
import com.ruoyi.system.service.ISMenuService;
import com.ruoyi.common.core.text.Convert;

/**
 * 系统菜单Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
@Service
public class SMenuServiceImpl implements ISMenuService 
{
    @Autowired
    private SMenuMapper sMenuMapper;

    /**
     * 查询系统菜单
     * 
     * @param id 系统菜单ID
     * @return 系统菜单
     */
    @Override
    public SMenu selectSMenuById(Long id)
    {
        return sMenuMapper.selectSMenuById(id);
    }

    /**
     * 查询系统菜单列表
     * 
     * @param sMenu 系统菜单
     * @return 系统菜单
     */
    @Override
    public List<SMenu> selectSMenuList(SMenu sMenu)
    {
        return sMenuMapper.selectSMenuList(sMenu);
    }

    /**
     * 新增系统菜单
     * 
     * @param sMenu 系统菜单
     * @return 结果
     */
    @Override
    public int insertSMenu(SMenu sMenu)
    {
        sMenu.setCreateTime(DateUtils.getNowDate());
        return sMenuMapper.insertSMenu(sMenu);
    }

    /**
     * 修改系统菜单
     * 
     * @param sMenu 系统菜单
     * @return 结果
     */
    @Override
    public int updateSMenu(SMenu sMenu)
    {
        return sMenuMapper.updateSMenu(sMenu);
    }

    /**
     * 删除系统菜单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSMenuByIds(String ids)
    {
        return sMenuMapper.deleteSMenuByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除系统菜单信息
     * 
     * @param id 系统菜单ID
     * @return 结果
     */
    @Override
    public int deleteSMenuById(Long id)
    {
        return sMenuMapper.deleteSMenuById(id);
    }
}
