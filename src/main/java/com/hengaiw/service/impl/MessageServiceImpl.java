package com.hengaiw.service.impl;

import com.hengaiw.mapper.messageMapper;
import com.hengaiw.model.message;
import com.hengaiw.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private static Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    private messageMapper MessageMapper;

	@Override
	public int insertMessage(message record) {
		// TODO Auto-generated method stub
		
		return MessageMapper.insertSelective(record);
	}

}
