package com.hengaiw.service;

import com.hengaiw.model.User;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.commons.result.UserVo;

/**
 * @description：线路管理
 * @author：hengaiw.com
 * @date：2016/09/13
 */
public interface Dc_ra_lineService {
    
    /**
     * 线路列表
     *
     * @param pageInfo
     */
    void findDcRaLineList(HaPageInfo pageInfo);

    

}
