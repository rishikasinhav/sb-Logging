package com.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.msgService;
@RestController
public class msgController {
	
	@Autowired
	private msgService msg;
	
	@GetMapping("/welcome")
	public String getMsg()
	{
		return msg.getWelcomeMsg();
	}

}
