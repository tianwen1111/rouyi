package com.ruoyi.system.mapper;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.system.domain.TmUser;
import java.util.List;

/**
 * 用户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2022-05-09
 */
//@DataSource(value = DataSourceType.SLAVE)
public interface TmUserMapper 
{
    /**
     * 查询用户信息
     * 
     * @param userId 用户信息ID
     * @return 用户信息
     */
    @DataSource(value = DataSourceType.SLAVE)
    public TmUser selectTmUserById(Long userId);

    /**
     * 查询用户信息列表
     * 
     * @param tmUser 用户信息
     * @return 用户信息集合
     */
    public List<TmUser> selectTmUserList(TmUser tmUser);

    /**
     * 新增用户信息
     * 
     * @param tmUser 用户信息
     * @return 结果
     */
    public int insertTmUser(TmUser tmUser);

    /**
     * 修改用户信息
     * 
     * @param tmUser 用户信息
     * @return 结果
     */
    public int updateTmUser(TmUser tmUser);

    /**
     * 删除用户信息
     * 
     * @param userId 用户信息ID
     * @return 结果
     */
    public int deleteTmUserById(Long userId);

    /**
     * 批量删除用户信息
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTmUserByIds(String[] userIds);
}
