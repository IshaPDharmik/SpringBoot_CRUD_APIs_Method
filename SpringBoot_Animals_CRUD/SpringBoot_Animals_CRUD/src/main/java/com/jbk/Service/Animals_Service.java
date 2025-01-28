package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Animals_Dao;
import com.jbk.Entity.Animals_Entity;

@Service
public class Animals_Service {

	@Autowired
	Animals_Dao dao;

	public String insertdata(Animals_Entity A) {
		String msg = dao.insertData(A);
		return msg;
	}

	public String deletedata(int a_ID) {
		String msg = dao.deleteData(a_ID);
		return msg;
	}

	public String updatedata(Animals_Entity A, int a_ID) {
		String msg = dao.updateData(A, a_ID);
		return msg;
	}

	public List<Animals_Entity> getAllData() {
		List<Animals_Entity> list = dao.getAllRecord();
		return list;
	}

	public Animals_Entity getAnimals_Entity(int a_ID) {
		Animals_Entity msg = dao.getSingleRecord(a_ID);
		return msg;

	}
}
