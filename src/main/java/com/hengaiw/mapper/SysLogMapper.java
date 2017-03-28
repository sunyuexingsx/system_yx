package com.hengaiw.mapper;

import com.hengaiw.model.SysLog;
import com.hengaiw.commons.utils.HaPageInfo;

import java.util.List;

public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

    List findDataGrid(HaPageInfo pageInfo);

    int findDataGridCount(HaPageInfo pageInfo);
}