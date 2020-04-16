package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SUserMapper;
import com.ruoyi.system.domain.SUser;
import com.ruoyi.system.service.ISUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 系统用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
@Service
public class SUserServiceImpl implements ISUserService 
{
    @Autowired
    private SUserMapper sUserMapper;

    /**
     * 查询系统用户
     * 
     * @param id 系统用户ID
     * @return 系统用户
     */
    @Override
    public SUser selectSUserById(Long id)
    {
        return sUserMapper.selectSUserById(id);
    }

    /**
     * 查询系统用户列表
     * 
     * @param sUser 系统用户
     * @return 系统用户
     */
    @Override
    public List<SUser> selectSUserList(SUser sUser)
    {
        List<SUser> sUsers = sUserMapper.selectSUserList(sUser);
        return sUsers;
    }

    /**
     * 新增系统用户
     * 
     * @param sUser 系统用户
     * @return 结果
     */
    @Override
    public int insertSUser(SUser sUser)
    {
        return sUserMapper.insertSUser(sUser);
    }

    /**
     * 修改系统用户
     * 
     * @param sUser 系统用户
     * @return 结果
     */
    @Override
    public int updateSUser(SUser sUser)
    {
        return sUserMapper.updateSUser(sUser);
    }

    /**
     * 删除系统用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSUserByIds(String ids)
    {
        return sUserMapper.deleteSUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除系统用户信息
     * 
     * @param id 系统用户ID
     * @return 结果
     */
    @Override
    public int deleteSUserById(Long id)
    {
        return sUserMapper.deleteSUserById(id);
    }

    @Override
    public SUser selectUserByUsername(String username) {
        return sUserMapper.selectSUserByUsername(username);
    }
}
