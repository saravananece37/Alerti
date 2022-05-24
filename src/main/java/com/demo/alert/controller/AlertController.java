package com.demo.alert.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.alert.model.Alert;

@RestController
public class AlertController {

	
	
	@RequestMapping(value="/alert",method=RequestMethod.POST)
	public void newAlert(@RequestBody Alert alert)
	{
		
	}
	
}
