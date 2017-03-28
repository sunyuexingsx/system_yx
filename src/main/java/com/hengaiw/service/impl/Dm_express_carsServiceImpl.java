package com.hengaiw.service.impl;

import com.hengaiw.mapper.dm_express_carsMapper;
import com.hengaiw.model.dm_express_cars;
import com.hengaiw.service.Dm_express_carsService;
import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dm_express_carsServiceImpl implements Dm_express_carsService {

    private static Logger LOGGER = LoggerFactory.getLogger(Dm_express_carsServiceImpl.class);

    @Autowired
    private dm_express_carsMapper DmExpressCarsMapper;

   
	@Override
	public void findQcworkList(HaPageInfo pageInfo) {
		// TODO Auto-generated method stub
		pageInfo.setRows(DmExpressCarsMapper.findQcworkPageCondition(pageInfo));
        pageInfo.setTotal(DmExpressCarsMapper.findQcworkPageCount(pageInfo));
        
	}





	@Override
	public void findEndworkList(HaPageInfo pageInfo) {
		// TODO Auto-generated method stub
		pageInfo.setRows(DmExpressCarsMapper.findEndworkPageCondition(pageInfo));
        pageInfo.setTotal(DmExpressCarsMapper.findEndworkPageCount(pageInfo));
	}





	@Override
	public void findAirworkList(HaPageInfo pageInfo) {
		// TODO Auto-generated method stub
		pageInfo.setRows(DmExpressCarsMapper.findAirworkPageCondition(pageInfo));
        pageInfo.setTotal(DmExpressCarsMapper.findAirworkPageCount(pageInfo));
	}





	@Override
	public void updateQcworkSortById(Long iCarsId, int qcworkSeq) {
		// TODO Auto-generated method stub
		DmExpressCarsMapper.updateQcworkSortById(iCarsId, qcworkSeq);
	}





	@Override
	public dm_express_cars selectByPrimaryKey(Long iCarsId) {
		// TODO Auto-generated method stub
		return DmExpressCarsMapper.selectByPrimaryKey(iCarsId);
	}





	@Override
	public dm_express_cars selectByQcworkSeq(int qcworkSeq) {
		// TODO Auto-generated method stub
		return DmExpressCarsMapper.selectByQcworkSeq(qcworkSeq);
	}





	@Override
	public dm_express_cars selectByBigQcworkSeq(int qcworkSeq) {
		// TODO Auto-generated method stub
		return DmExpressCarsMapper.selectByBigQcworkSeq(qcworkSeq);
	}





	@Override
	public dm_express_cars selectBySmallQcworkSeq(int qcworkSeq) {
		// TODO Auto-generated method stub
		return DmExpressCarsMapper.selectBySmallQcworkSeq(qcworkSeq);
	}

}
