package com.hengaiw.mapper;

import com.hengaiw.model.dm_td_tra_text;

public interface dm_td_tra_textMapper {
    int deleteByPrimaryKey(Long iTraSeq);

    int insert(dm_td_tra_text record);

    int insertSelective(dm_td_tra_text record);

    dm_td_tra_text selectByPrimaryKey(Long iTraSeq);

    int updateByPrimaryKeySelective(dm_td_tra_text record);

    int updateByPrimaryKey(dm_td_tra_text record);
}