package com.hengaiw.mapper;

import com.hengaiw.model.dm_express_cut;

public interface dm_express_cutMapper {
    int deleteByPrimaryKey(Long iCutId);

    int insert(dm_express_cut record);

    int insertSelective(dm_express_cut record);

    dm_express_cut selectByPrimaryKey(Long iCutId);

    int updateByPrimaryKeySelective(dm_express_cut record);

    int updateByPrimaryKey(dm_express_cut record);
}