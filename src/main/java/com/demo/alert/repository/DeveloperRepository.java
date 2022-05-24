package com.demo.alert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.alert.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Integer>{

}
