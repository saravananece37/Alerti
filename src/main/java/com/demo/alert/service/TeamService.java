package com.demo.alert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.alert.dao.DataStore;
import com.demo.alert.model.Developer;
import com.demo.alert.model.Team;
import com.demo.alert.repository.DeveloperRepository;
import com.demo.alert.repository.TeamRepository;

@Service
public class TeamService {

	
	@Autowired
	DataStore dataStore;

	// 1 cache // developer 
	public void addNewTeam(Team team,List<Developer> developers)throws Exception
	{
//		developer.setTeamID(team.getId());
		
		for(Developer developer:developers)
			developer.setTeamID(team.getId());
		
		dataStore.saveNewTeam(team, developers);
	}
}
