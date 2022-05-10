package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TmUserMapper;
import com.ruoyi.system.domain.TmUser;
import com.ruoyi.system.service.ITmUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 用户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class TmUserServiceImpl implements ITmUserService 
{
    @Autowired
    private TmUserMapper tmUserMapper;

    /**
     * 查询用户信息
     * 
     * @param userId 用户信息ID
     * @return 用户信息
     */
    @Override
    public TmUser selectTmUserById(Long userId)
    {
        return tmUserMapper.selectTmUserById(userId);
    }

    /**
     * 查询用户信息列表
     * 
     * @param tmUser 用户信息
     * @return 用户信息
     */
    @Override
    public List<TmUser> selectTmUserList(TmUser tmUser)
    {
        return tmUserMapper.selectTmUserList(tmUser);
    }

    /**
     * 新增用户信息
     * 
     * @param tmUser 用户信息
     * @return 结果
     */
    @Override
    public int insertTmUser(TmUser tmUser)
    {
        tmUser.setCreateTime(DateUtils.getNowDate());
        return tmUserMapper.insertTmUser(tmUser);
    }

    /**
     * 修改用户信息
     * 
     * @param tmUser 用户信息
     * @return 结果
     */
    @Override
    public int updateTmUser(TmUser tmUser)
    {
        tmUser.setUpdateTime(DateUtils.getNowDate());
        return tmUserMapper.updateTmUser(tmUser);
    }

    /**
     * 删除用户信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTmUserByIds(String ids)
    {
        return tmUserMapper.deleteTmUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户信息信息
     * 
     * @param userId 用户信息ID
     * @return 结果
     */
    @Override
    public int deleteTmUserById(Long userId)
    {
        return tmUserMapper.deleteTmUserById(userId);
    }
}
