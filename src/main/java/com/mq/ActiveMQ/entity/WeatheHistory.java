package com.mq.ActiveMQ.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "weather")
public class WeatheHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName = "public.id_sequence", allocationSize = 1)
	
	@Column(name = "id")
	private int id;
	
	@Column(name ="location")
	private String location;
	
	@Column(name= "temp_f")
	private Double temp_f;
	
	@Column(name= "feelslike_f")
	private Double feelslike_f;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getTemp_f() {
		return temp_f;
	}

	public void setTemp_f(Double temp_f) {
		this.temp_f = temp_f;
	}

	public Double getFeelslike_f() {
		return feelslike_f;
	}

	public void setFeelslike_f(Double feelslike_f) {
		this.feelslike_f = feelslike_f;
	}
}
