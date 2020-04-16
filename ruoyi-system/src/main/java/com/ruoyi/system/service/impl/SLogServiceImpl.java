package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SLogMapper;
import com.ruoyi.system.domain.SLog;
import com.ruoyi.system.service.ISLogService;
import com.ruoyi.common.core.text.Convert;

/**
 * 系统登录日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
@Service
public class SLogServiceImpl implements ISLogService 
{
    @Autowired
    private SLogMapper sLogMapper;

    /**
     * 查询系统登录日志
     * 
     * @param id 系统登录日志ID
     * @return 系统登录日志
     */
    @Override
    public SLog selectSLogById(Long id)
    {
        return sLogMapper.selectSLogById(id);
    }

    /**
     * 查询系统登录日志列表
     * 
     * @param sLog 系统登录日志
     * @return 系统登录日志
     */
    @Override
    public List<SLog> selectSLogList(SLog sLog)
    {
        return sLogMapper.selectSLogList(sLog);
    }

    /**
     * 新增系统登录日志
     * 
     * @param sLog 系统登录日志
     * @return 结果
     */
    @Override
    public int insertSLog(SLog sLog)
    {
        return sLogMapper.insertSLog(sLog);
    }

    /**
     * 修改系统登录日志
     * 
     * @param sLog 系统登录日志
     * @return 结果
     */
    @Override
    public int updateSLog(SLog sLog)
    {
        return sLogMapper.updateSLog(sLog);
    }

    /**
     * 删除系统登录日志对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSLogByIds(String ids)
    {
        return sLogMapper.deleteSLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除系统登录日志信息
     * 
     * @param id 系统登录日志ID
     * @return 结果
     */
    @Override
    public int deleteSLogById(Long id)
    {
        return sLogMapper.deleteSLogById(id);
    }
}
