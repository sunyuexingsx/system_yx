package com.hengaiw.mapper;

import com.hengaiw.model.work;

public interface workMapper {
    int deleteByPrimaryKey(Long iTraId);

    int insert(work record);

    int insertSelective(work record);

    work selectByPrimaryKey(Long iTraId);

    int updateByPrimaryKeySelective(work record);

    int updateByPrimaryKey(work record);
}