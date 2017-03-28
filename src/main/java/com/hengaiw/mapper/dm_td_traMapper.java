package com.hengaiw.mapper;

import java.util.List;

import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.model.dm_express_cars;
import com.hengaiw.model.dm_td_tra;

public interface dm_td_traMapper {
    int deleteByPrimaryKey(Long iTraId);

    int insert(dm_td_tra record);

    int insertSelective(dm_td_tra record);

    dm_td_tra selectByPrimaryKey(Long iTraId);

    int updateByPrimaryKeySelective(dm_td_tra record);

    int updateByPrimaryKey(dm_td_tra record);
    /**
     * 列表
     *
     * @param pageInfo
     * @return
     */
    List findDmTdTraPageCondition(HaPageInfo pageInfo);
    /**
     * 统计
     *
     * @param pageInfo
     * @return
     */
    int findDmTdTraPageCount(HaPageInfo pageInfo);
    
    List findQcworkPageCondition(HaPageInfo pageInfo);
    int findQcworkPageCount(HaPageInfo pageInfo);
    
    QcworkVo selectQcworkByPrimaryKey(Long iTraId);
    QcworkVo selectByQcworkSeq(int qcworkSeq);
    QcworkVo selectByBigQcworkSeq(int qcworkSeq);
    QcworkVo selectBySmallQcworkSeq(int qcworkSeq);
}