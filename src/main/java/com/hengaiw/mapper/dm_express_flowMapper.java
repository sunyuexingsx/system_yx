package com.hengaiw.mapper;

import com.hengaiw.model.dm_express_flow;

public interface dm_express_flowMapper {
    int deleteByPrimaryKey(Integer iFlowId);

    int insert(dm_express_flow record);

    int insertSelective(dm_express_flow record);

    dm_express_flow selectByPrimaryKey(Integer iFlowId);

    int updateByPrimaryKeySelective(dm_express_flow record);

    int updateByPrimaryKey(dm_express_flow record);
}