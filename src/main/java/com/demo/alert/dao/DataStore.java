package com.demo.alert.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.alert.model.Alert;
import com.demo.alert.model.Developer;
import com.demo.alert.model.Team;
import com.demo.alert.repository.AlertRepository;
import com.demo.alert.repository.DeveloperRepository;
import com.demo.alert.repository.TeamRepository;

@Service
public class DataStore {

	@Autowired
	TeamRepository teamRepo;
	
	@Autowired
	DeveloperRepository developerRepo;
	
	

	@Autowired
	AlertRepository alertRepo;
	
	@Transactional
	public void saveNewTeam(Team team, List<Developer> developers)throws Exception
	{
		
		teamRepo.save(team);
		developerRepo.saveAll(developers);
		
	}
	
	
	public void createNewAlert(Alert alert)
	{
		alertRepo.save(alert);
	}
	
	
	
}
