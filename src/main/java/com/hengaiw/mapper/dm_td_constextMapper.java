package com.hengaiw.mapper;

import com.hengaiw.model.dm_td_constext;

public interface dm_td_constextMapper {
    int deleteByPrimaryKey(Long iCarId);

    int insert(dm_td_constext record);

    int insertSelective(dm_td_constext record);

    dm_td_constext selectByPrimaryKey(Long iCarId);

    int updateByPrimaryKeySelective(dm_td_constext record);

    int updateByPrimaryKey(dm_td_constext record);
}