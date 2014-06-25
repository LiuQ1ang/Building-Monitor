package com.ca.testdb;

import javax.sql.DataSource;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;

import com.ca.pojo.User;

public class testdb {

	public static void main(String[] args) {
		Ioc ioc = new NutIoc(new JsonLoader("dao.js"));
		DataSource ds = ioc.get(DataSource.class);
		Dao dao = new NutDao(ds);
		User user = new User(null, null);
		user.setUsername("老孙的内裤");
		user.setPassword("蓝色的");
		dao.insert(user);
	}

}
