package com.hengaiw.mapper;

import java.util.List;

import com.hengaiw.model.Role;
import com.hengaiw.model.UserRole;

public interface UserRoleMapper {

    int insert(UserRole userRole);

    int updateByPrimaryKeySelective(UserRole userRole);

    List<UserRole> findUserRoleByUserId(Long userId);
    List<Role> findUserRoleListByUserId(Long userId);

    int deleteById(Long id);

    List<Long> findRoleIdListByUserId(Long userId);
}