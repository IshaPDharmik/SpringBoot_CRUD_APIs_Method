package com.jbk.SpringBoot_Cycle_CRUD_Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.stereotype.Repository;

import com.jbk.Entity.Cycle_Entity;

@Repository
public class Cycle_Dao {

	@Autowired
	SessionFactory factory;

	public String insertData(Cycle_Entity c) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		s.persist(c);
		tr.commit();
		s.close();
		return "Data is inserted Successfully...!";

	}


}
