package com.hengaiw.service;

import com.hengaiw.model.User;
import com.hengaiw.commons.utils.HaPageInfo;

import java.util.List;

import com.hengaiw.commons.result.UserVo;

/**
 * @description：用户管理
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public interface UserService {
    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User findUserByLoginName(String username);

    List<UserVo> findUserAll();
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
     */
    void findDataGrid(HaPageInfo pageInfo);

    /**
     * 添加用户
     *
     * @param userVo
     */
    void addUser(UserVo userVo);

    /**
     * 修改密码
     *
     * @param userId
     * @param pwd
     */
    void updateUserPwdById(Long userId, String pwd);

    /**
     * 根据用户id查询用户带部门
     *
     * @param id
     * @return
     */
    UserVo findUserVoById(Long id);

    /**
     * 修改用户
     *
     * @param userVo
     */
    void updateUser(UserVo userVo);

    /**
     * 删除用户
     *
     * @param id
     */
    void deleteUserById(Long id);
    
    List <UserVo> findUserByOrganizationId(Long id);
}
