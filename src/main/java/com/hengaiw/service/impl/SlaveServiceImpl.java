package com.hengaiw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.commons.annotation.DataSourceChange;
import com.hengaiw.mapper.SlaveMapper;
import com.hengaiw.service.SlaveService;
@Service
public class SlaveServiceImpl implements SlaveService {

    @Autowired
    private SlaveMapper slaveMapper;

    @Override
    @DataSourceChange(slave = true)
    public Integer count() {
        return slaveMapper.count();
    }


}
