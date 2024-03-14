package com.app.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Service
public class msgService {

	private Logger logger= LoggerFactory.getLogger(msgService.class);
	public String getWelcomeMsg()
	{
		logger.debug("getWelcomeMsg started!!!!");
		String msg="welcome to ashokIT";
		logger.debug("getWelcomeMsg Ended!!!!");
		return msg+"--by Rishika";
	}
}
