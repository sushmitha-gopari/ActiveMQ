package com.mq.ActiveMQ.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mq.ActiveMQ.entity.Weather;
import com.mq.ActiveMQ.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	public ProducerService producerService;
	
	@GetMapping("currentWeather/{place}")
	public Weather currentWeather(@PathVariable String place) throws IOException{
		return producerService.currentWeather(place);
	}
}
