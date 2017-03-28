package com.hengaiw.mapper;

import com.hengaiw.model.message;

public interface messageMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(message record);

    int insertSelective(message record);

    message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(message record);

    int updateByPrimaryKey(message record);
}