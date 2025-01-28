package com.jbk.SpringBoot_Cycle_CRUD_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Cycle_Dao;
import com.jbk.Entity.Cycle_Entity;

@Service
public class Cycle_Service {

	@Autowired
	Cycle_Entity dao;

	public String insertdata(Cycle_Entity c) {
		String msg = dao.insertData(c);
		return msg;
	}

}
