package com.demo.alert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;

import com.demo.alert.model.Team;


@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
	

	

}
