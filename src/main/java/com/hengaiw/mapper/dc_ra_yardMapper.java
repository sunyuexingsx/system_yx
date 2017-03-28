package com.hengaiw.mapper;

import com.hengaiw.model.dc_ra_yard;

public interface dc_ra_yardMapper {
    int deleteByPrimaryKey(Integer iRangeId);

    int insert(dc_ra_yard record);

    int insertSelective(dc_ra_yard record);

    dc_ra_yard selectByPrimaryKey(Integer iRangeId);

    int updateByPrimaryKeySelective(dc_ra_yard record);

    int updateByPrimaryKey(dc_ra_yard record);
    
    
}