package com.hengaiw.service;

import com.hengaiw.model.SysLog;
import com.hengaiw.commons.utils.HaPageInfo;

/**
 * @description：操作日志
 * @author：zhixuan.wang
 * @date：2015/10/30 10:35
 */
public interface LogService {

    void insertLog(SysLog sysLog);

    void findDataGrid(HaPageInfo pageInfo);
}
