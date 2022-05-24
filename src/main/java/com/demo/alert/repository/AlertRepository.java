package com.demo.alert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.alert.model.Alert;

public interface AlertRepository extends JpaRepository<Alert, Integer> {

}
