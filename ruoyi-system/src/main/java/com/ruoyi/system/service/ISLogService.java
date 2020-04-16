package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SLog;

/**
 * 系统登录日志Service接口
 * 
 * @author ruoyi
 * @date 2020-04-15
 */
public interface ISLogService 
{
    /**
     * 查询系统登录日志
     * 
     * @param id 系统登录日志ID
     * @return 系统登录日志
     */
    public SLog selectSLogById(Long id);

    /**
     * 查询系统登录日志列表
     * 
     * @param sLog 系统登录日志
     * @return 系统登录日志集合
     */
    public List<SLog> selectSLogList(SLog sLog);

    /**
     * 新增系统登录日志
     * 
     * @param sLog 系统登录日志
     * @return 结果
     */
    public int insertSLog(SLog sLog);

    /**
     * 修改系统登录日志
     * 
     * @param sLog 系统登录日志
     * @return 结果
     */
    public int updateSLog(SLog sLog);

    /**
     * 批量删除系统登录日志
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSLogByIds(String ids);

    /**
     * 删除系统登录日志信息
     * 
     * @param id 系统登录日志ID
     * @return 结果
     */
    public int deleteSLogById(Long id);
}
