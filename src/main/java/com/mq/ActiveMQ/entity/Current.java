package com.mq.ActiveMQ.entity;

public class Current {
	
	private Condition condition;
	
	private long last_updated_epoch;
	private String last_updated;
	private Double temp_c;
	private Double temp_f;
	private int is_day;
	private Double wind_mph;
	private Double wind_kph;
	private int wind_degree;
	private String wind_dir;
	private Double pressure_mb;
	private Double pressure_in;
	private Double precip_mm;
	private Double precip_in;
	private int humidity;
	private int cloud;
	private Double feelslike_c;
	private Double feelslike_f;
	private Double vis_km;
	private Double vis_miles;
	private Double uv;
    private Double gust_mph;
    private Double gust_kph;
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public long getLast_updated_epoch() {
		return last_updated_epoch;
	}
	public void setLast_updated_epoch(long last_updated_epoch) {
		this.last_updated_epoch = last_updated_epoch;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public Double getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(Double temp_c) {
		this.temp_c = temp_c;
	}
	public Double getTemp_f() {
		return temp_f;
	}
	public void setTemp_f(Double temp_f) {
		this.temp_f = temp_f;
	}
	public int getIs_day() {
		return is_day;
	}
	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}
	public Double getWind_mph() {
		return wind_mph;
	}
	public void setWind_mph(Double wind_mph) {
		this.wind_mph = wind_mph;
	}
	public Double getWind_kph() {
		return wind_kph;
	}
	public void setWind_kph(Double wind_kph) {
		this.wind_kph = wind_kph;
	}
	public int getWind_degree() {
		return wind_degree;
	}
	public void setWind_degree(int wind_degree) {
		this.wind_degree = wind_degree;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public Double getPressure_mb() {
		return pressure_mb;
	}
	public void setPressure_mb(Double pressure_mb) {
		this.pressure_mb = pressure_mb;
	}
	public Double getPressure_in() {
		return pressure_in;
	}
	public void setPressure_in(Double pressure_in) {
		this.pressure_in = pressure_in;
	}
	public Double getPrecip_mm() {
		return precip_mm;
	}
	public void setPrecip_mm(Double precip_mm) {
		this.precip_mm = precip_mm;
	}
	public Double getPrecip_in() {
		return precip_in;
	}
	public void setPrecip_in(Double precip_in) {
		this.precip_in = precip_in;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public Double getFeelslike_c() {
		return feelslike_c;
	}
	public void setFeelslike_c(Double feelslike_c) {
		this.feelslike_c = feelslike_c;
	}
	public Double getFeelslike_f() {
		return feelslike_f;
	}
	public void setFeelslike_f(Double feelslike_f) {
		this.feelslike_f = feelslike_f;
	}
	public Double getVis_km() {
		return vis_km;
	}
	public void setVis_km(Double vis_km) {
		this.vis_km = vis_km;
	}
	public Double getVis_miles() {
		return vis_miles;
	}
	public void setVis_miles(Double vis_miles) {
		this.vis_miles = vis_miles;
	}
	public Double getUv() {
		return uv;
	}
	public void setUv(Double uv) {
		this.uv = uv;
	}
	public Double getGust_mph() {
		return gust_mph;
	}
	public void setGust_mph(Double gust_mph) {
		this.gust_mph = gust_mph;
	}
	public Double getGust_kph() {
		return gust_kph;
	}
	public void setGust_kph(Double gust_kph) {
		this.gust_kph = gust_kph;
	}
  
}
