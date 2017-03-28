package com.hengaiw.service.impl;

import com.hengaiw.mapper.dc_ra_lineMapper;
import com.hengaiw.service.Dc_ra_lineService;
import com.hengaiw.commons.utils.HaPageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dc_ra_lineServiceImpl implements Dc_ra_lineService {

    private static Logger LOGGER = LoggerFactory.getLogger(Dc_ra_lineServiceImpl.class);

    @Autowired
    private dc_ra_lineMapper DcRaLineMapper;

    

	@Override
	public void findDcRaLineList(HaPageInfo pageInfo) {
		// TODO Auto-generated method stub
		pageInfo.setRows(DcRaLineMapper.findDcRaLinePageCondition(pageInfo));
        pageInfo.setTotal(DcRaLineMapper.findDcRaLinePageCount(pageInfo));
	}

}
