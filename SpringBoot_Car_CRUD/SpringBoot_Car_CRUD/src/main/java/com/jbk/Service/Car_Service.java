package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Car_Dao;
import com.jbk.Entity.Car_Entity;

@Service
public class Car_Service {

	@Autowired
	Car_Dao dao;

	public String insertdata(Car_Entity C) {
		String msg = dao.insertData(C);
		return msg;
	}

	public String deletedata(int c_id) {
		String msg = dao.deleteData(c_id);
		return msg;
	}

	public String updatedata(Car_Entity C, int c_id) {
		String msg = dao.updateData(C, c_id);
		return msg;
	}

	public List<Car_Entity> getAllData() {
		List<Car_Entity> list = dao.getAllRecord();
		return list;
	}

	public Car_Entity getCar_Entity(int c_id) {
		Car_Entity msg = dao.getSingleRecord(c_id);
		return msg;
	}
}
