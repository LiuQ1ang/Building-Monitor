package com.ca.impl.service;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.service.NameEntityService;

import com.ca.pojo.Data;
import com.ca.service.DataService;

public class DataServiceImpl extends NameEntityService<Data> implements DataService{

	public Data SelDataById(int id) {
		return this.dao().fetch(Data.class,id);
	}

	public List<Data> SelDataByAttr(String attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	public Data SelDataByAttrDesc(String attribute) {
		return this.dao().fetch(Data.class, Cnd.wrap("sensorid ='" + attribute + "' ORDER BY id DESC"));
	}
}
