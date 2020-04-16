package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SUser;

/**
 * 系统用户Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
public interface SUserMapper 
{
    /**
     * 查询系统用户
     * 
     * @param id 系统用户ID
     * @return 系统用户
     */
    public SUser selectSUserById(Long id);

    /**
     * 查询系统用户列表
     * 
     * @param sUser 系统用户
     * @return 系统用户集合
     */
    public List<SUser> selectSUserList(SUser sUser);

    /**
     * 新增系统用户
     * 
     * @param sUser 系统用户
     * @return 结果
     */
    public int insertSUser(SUser sUser);

    /**
     * 修改系统用户
     * 
     * @param sUser 系统用户
     * @return 结果
     */
    public int updateSUser(SUser sUser);

    /**
     * 删除系统用户
     * 
     * @param id 系统用户ID
     * @return 结果
     */
    public int deleteSUserById(Long id);

    /**
     * 批量删除系统用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSUserByIds(String[] ids);

    SUser selectSUserByUsername(String username);
}
