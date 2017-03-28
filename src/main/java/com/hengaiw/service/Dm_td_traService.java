package com.hengaiw.service;

import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;

/**
 * @description：线路管理
 * @author：hengaiw.com
 * @date：2016/09/13
 */
public interface Dm_td_traService {
    
    /**
     * 列车目录列表
     *
     * @param pageInfo
     */
    void findDmTdTraList(HaPageInfo pageInfo);

    /**
     * 货检作业列表
     *
     * @param pageInfo
     */
    void findQcworkList(HaPageInfo pageInfo);
    
    void updateQcworkSortById(Long iCarsId, int qcworkSeq);
    
    QcworkVo selectQcworkByPrimaryKey(Long iTraId);
    QcworkVo selectByQcworkSeq(int qcworkSeq);
    QcworkVo selectByBigQcworkSeq(int qcworkSeq);
    QcworkVo selectBySmallQcworkSeq(int qcworkSeq);
}
