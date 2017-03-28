package com.hengaiw.mapper;

import java.util.List;

import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.model.dc_ra_line;

public interface dc_ra_lineMapper {
    int deleteByPrimaryKey(Integer iLineId);

    int insert(dc_ra_line record);

    int insertSelective(dc_ra_line record);

    dc_ra_line selectByPrimaryKey(Integer iLineId);

    int updateByPrimaryKeySelective(dc_ra_line record);

    int updateByPrimaryKey(dc_ra_line record);
    /**
     * 列表
     *
     * @param pageInfo
     * @return
     */
    List findDcRaLinePageCondition(HaPageInfo pageInfo);
    /**
     * 统计
     *
     * @param pageInfo
     * @return
     */
    int findDcRaLinePageCount(HaPageInfo pageInfo);

}