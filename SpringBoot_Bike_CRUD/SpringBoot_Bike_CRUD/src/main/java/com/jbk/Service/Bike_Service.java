package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Bike_Dao;
import com.jbk.Entity.Bike_Entity;

@Service
public class Bike_Service {

	@Autowired
	Bike_Dao dao;

	public String insertdata(Bike_Entity B) {
		String msg = dao.insertData(B);
		return msg;
	}

	public String deletedata(int b_Id) {
		String msg = dao.deleteData(b_Id);
		return msg;
	}

	public String updatedata(Bike_Entity B, int b_Id) {
		String msg = dao.updateData(B, b_Id);
		return msg;
	}

	public List<Bike_Entity> getAllData() {
		List<Bike_Entity> list = dao.getAllRecord();
		return list;
	}

	public Bike_Entity getBike_Entity(int b_Id) {
		Bike_Entity msg = dao.getSingleRecord(b_Id);
		return msg;
	}
}
