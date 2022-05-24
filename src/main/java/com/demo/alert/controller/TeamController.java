package com.demo.alert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.alert.model.Developer;
import com.demo.alert.model.Team;
import com.demo.alert.service.TeamService;

@RestController
public class TeamController {
	
	
	@Autowired
	TeamService teamService;
	
	
	
	@RequestMapping(value="/addNeweTeam",method=RequestMethod.POST)
	public void addNewTeam(@RequestBody Team team, List<Developer> developers)
	{
		
		try
		{
			teamService.addNewTeam(team, developers);
		}
		catch(Exception e)
		{
			//call exception handler
		}
	
	}
	
	
	
	
	
	
	

}
