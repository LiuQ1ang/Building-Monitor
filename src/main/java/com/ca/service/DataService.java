package com.ca.service;

import java.util.List;

import com.ca.pojo.Data;

public interface DataService {
	public Data SelDataById(int id);
	public Data SelDataByAttrDesc(String attribute);
	public List<Data> SelDataByAttr(String attribute);
}
