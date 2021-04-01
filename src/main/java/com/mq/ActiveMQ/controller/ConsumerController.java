package com.mq.ActiveMQ.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.stereotype.Component;

import com.mq.ActiveMQ.entity.WeatheHistory;
import com.mq.ActiveMQ.entity.Weather;
import com.mq.ActiveMQ.repository.WeatherHistoryRepository;

@Component
public class ConsumerController {

	@Autowired
	private WeatherHistoryRepository historyRepository;
	
	@JmsListener(destination = "WeatherQueue")
	public void WeatherConsumer(Weather message) throws MessageConversionException, JMSException{
		Logger logger = Logger.getLogger("CONSUMER");
		logger.log(Level.INFO, "Invoking Consumer");
		Weather weather = message;
		WeatheHistory history = new WeatheHistory();
		history.setLocation(weather.getLocation().getName());
		history.setTemp_f(weather.getCurrent().getTemp_f());
		history.setFeelslike_f(weather.getCurrent().getFeelslike_f());
		historyRepository.save(history);
	}
}
