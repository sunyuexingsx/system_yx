package com.hengaiw.mapper;

import com.hengaiw.model.User;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.commons.result.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User findUserByLoginName(String username);

    /**
     * 根据用户id查询用户
     *
     * @param id
     * @return
     */
    User findUserById(Long id);

    /**
     * 用户列表
     *
     * @param pageInfo
     * @return
     */
    List findUserPageCondition(HaPageInfo pageInfo);
    
    List selectAll();

    /**
     * 统计用户
     *
     * @param pageInfo
     * @return
     */
    int findUserPageCount(HaPageInfo pageInfo);

    /**
     * 修改用户密码
     *
     * @param userId
     * @param pwd
     */
    void updateUserPwdById(@Param("userId") Long userId, @Param("pwd") String pwd);

    /**
     * 根据用户id查询用户带部门
     *
     * @param id
     * @return
     */
    UserVo findUserVoById(Long id);
    
    List<UserVo> findUserByOrganizationId(Long id);
    
}