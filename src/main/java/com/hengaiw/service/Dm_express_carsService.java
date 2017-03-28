package com.hengaiw.service;

import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.model.dm_express_cars;

/**
 * @description：线路管理
 * @author：hengaiw.com
 * @date：2016/09/13
 */
public interface Dm_express_carsService {
    
    /**
     * 货检作业列表
     *
     * @param pageInfo
     */
    void findQcworkList(HaPageInfo pageInfo);
    
    dm_express_cars selectByPrimaryKey(Long iCarsId);
    dm_express_cars selectByQcworkSeq(int qcworkSeq);
    dm_express_cars selectByBigQcworkSeq(int qcworkSeq);
    dm_express_cars selectBySmallQcworkSeq(int qcworkSeq);
    /**
     * 修改货检作业的排序
     *
     * @param userId
     * @param pwd
     */
    void updateQcworkSortById(Long iCarsId, int qcworkSeq);
    
    /**
     * 列尾作业列表
     *
     * @param pageInfo
     */
    void findEndworkList(HaPageInfo pageInfo);
    
    /**
     * 排风作业列表
     *
     * @param pageInfo
     */
    void findAirworkList(HaPageInfo pageInfo);
    

}
