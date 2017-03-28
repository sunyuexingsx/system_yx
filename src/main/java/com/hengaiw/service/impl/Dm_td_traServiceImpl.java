package com.hengaiw.service.impl;

import com.hengaiw.mapper.dm_td_traMapper;
import com.hengaiw.mapper.workMapper;
import com.hengaiw.model.work;
import com.hengaiw.service.Dm_td_traService;
import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dm_td_traServiceImpl implements Dm_td_traService {

    private static Logger LOGGER = LoggerFactory.getLogger(Dm_td_traServiceImpl.class);

    @Autowired
    private dm_td_traMapper DmTdTraMapper;
    @Autowired
    private workMapper workMapper;

    

	@Override
	public void findDmTdTraList(HaPageInfo pageInfo) {
		// TODO Auto-generated method stub
		pageInfo.setRows(DmTdTraMapper.findDmTdTraPageCondition(pageInfo));
        pageInfo.setTotal(DmTdTraMapper.findDmTdTraPageCount(pageInfo));
	}



	@Override
	public void findQcworkList(HaPageInfo pageInfo) {
		// TODO Auto-generated method stub
		List<QcworkVo> list=DmTdTraMapper.findQcworkPageCondition(pageInfo);
		for(int i=0;i<list.size();i++){
			if(list.get(i).getQcworkStatus()==null){
				work mywork=new work();
				mywork.setiTraId(list.get(i).getiTraId());
				int seq=((pageInfo.getNowpage()-1) * pageInfo.getPagesize())+(i+1);
				mywork.setQcworkSeq(seq);
				workMapper.insertSelective(mywork);
			}
		}
		pageInfo.setRows(list);
        pageInfo.setTotal(DmTdTraMapper.findQcworkPageCount(pageInfo));
	}



	@Override
	public QcworkVo selectQcworkByPrimaryKey(Long iTraId) {
		// TODO Auto-generated method stub
		return DmTdTraMapper.selectQcworkByPrimaryKey(iTraId);
	}



	@Override
	public QcworkVo selectByQcworkSeq(int qcworkSeq) {
		// TODO Auto-generated method stub
		return DmTdTraMapper.selectByQcworkSeq(qcworkSeq);
	}



	@Override
	public QcworkVo selectByBigQcworkSeq(int qcworkSeq) {
		// TODO Auto-generated method stub
		return DmTdTraMapper.selectByBigQcworkSeq(qcworkSeq);
	}



	@Override
	public QcworkVo selectBySmallQcworkSeq(int qcworkSeq) {
		// TODO Auto-generated method stub
		return DmTdTraMapper.selectBySmallQcworkSeq(qcworkSeq);
	}



	@Override
	public void updateQcworkSortById(Long iCarsId, int qcworkSeq) {
		// TODO Auto-generated method stub
		
	}




}
