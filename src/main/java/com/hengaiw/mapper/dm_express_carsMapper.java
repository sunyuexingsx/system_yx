package com.hengaiw.mapper;

import java.util.List;

import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.model.dm_express_cars;

public interface dm_express_carsMapper {
    int deleteByPrimaryKey(Long iCarsId);

    int insert(dm_express_cars record);

    int insertSelective(dm_express_cars record);

    dm_express_cars selectByPrimaryKey(Long iCarsId);

    dm_express_cars selectByQcworkSeq(int qcworkSeq);
    dm_express_cars selectByBigQcworkSeq(int qcworkSeq);
    dm_express_cars selectBySmallQcworkSeq(int qcworkSeq);
    
    int updateByPrimaryKeySelective(dm_express_cars record);

    int updateByPrimaryKey(dm_express_cars record);
    List findQcworkPageCondition(HaPageInfo pageInfo);
    int findQcworkPageCount(HaPageInfo pageInfo);
    void updateQcworkSortById(Long iCarsId, int qcworkSeq);
    
    List findEndworkPageCondition(HaPageInfo pageInfo);
    int findEndworkPageCount(HaPageInfo pageInfo);
    
    List findAirworkPageCondition(HaPageInfo pageInfo);
    int findAirworkPageCount(HaPageInfo pageInfo);
}