package com.hengaiw.service.impl;

import com.hengaiw.mapper.workMapper;
import com.hengaiw.model.work;
import com.hengaiw.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author：hengaiw.com
 * @date：2016/09/21
 */
@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private workMapper workMapper;

	@Override
	public void insertWork(work work) {
		// TODO Auto-generated method stub
		workMapper.insertSelective(work);
	}

	@Override
	public void updateWork(work work) {
		// TODO Auto-generated method stub
		workMapper.updateByPrimaryKeySelective(work);
	}

	

    

}
