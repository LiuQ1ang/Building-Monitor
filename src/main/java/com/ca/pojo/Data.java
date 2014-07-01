package com.ca.pojo;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * @author liuzhilong<alexmaven@icloud.com>
 */
@Table("t_data")
public class Data {
	@Id
	private Integer id;
	@Column
	private String temperature;
	@Column
	private String humidity;
	@Column
	private String datatime;
	@Column
	private String sensorid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getDatatime() {
		return datatime;
	}
	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}
	public String getSensorid() {
		return sensorid;
	}
	public void setSensorid(String sensorid) {
		this.sensorid = sensorid;
	}
}
