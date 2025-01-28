package com.jbk.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Entity.Car_Entity;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class Car_Dao {

	@Autowired
	SessionFactory factory;

	public String insertData(Car_Entity C) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		s.persist(C);
		tr.commit();
		s.close();
		return "Data is inserted..!";
	}

	public String deleteData(int c_id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Car_Entity c1 = s.get(Car_Entity.class, c_id);
		s.remove(c1);
		tr.commit();
		s.close();
		return "Data is deleted...!";
	}

	public String updateData(Car_Entity C, int c_id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Car_Entity c1 = s.get(Car_Entity.class, c_id);
		c1.setC_Model(C.getC_Model());
		c1.setC_Price(C.getC_Price());
		s.merge(c1);
		tr.commit();
		s.close();
		return "data is update....!";
	}

	public List<Car_Entity> getAllRecord() {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		HibernateCriteriaBuilder hcb = s.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Car_Entity> root = cq.from(Car_Entity.class);
		cq.select(root);
		Query query = s.createQuery(cq);
		List<Car_Entity> list = query.getResultList();
		return list;
	}

	public Car_Entity getSingleRecord(int c_id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Car_Entity c2 = s.get(Car_Entity.class, c_id);
		tr.commit();
		s.close();
		return c2;
	}
}
