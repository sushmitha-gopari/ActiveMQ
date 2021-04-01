package com.mq.ActiveMQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mq.ActiveMQ.entity.WeatheHistory;

@Repository
public interface WeatherHistoryRepository extends JpaRepository<WeatheHistory, Integer>{

}
