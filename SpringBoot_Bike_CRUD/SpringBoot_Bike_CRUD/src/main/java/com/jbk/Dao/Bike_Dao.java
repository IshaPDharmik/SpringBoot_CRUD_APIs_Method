package com.jbk.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Entity.Bike_Entity;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class Bike_Dao {

	@Autowired
	SessionFactory factory;

	public String insertData(Bike_Entity B) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		s.persist(B);
		tr.commit();
		s.close();
		return "Data is inserted..!";
	}

	public String deleteData(int b_Id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Bike_Entity b1 = s.get(Bike_Entity.class, b_Id);
		s.remove(b1);
		tr.commit();
		s.close();
		return "Data is deleted...!";
	}

	public String updateData(Bike_Entity B, int b_Id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Bike_Entity b1 = s.get(Bike_Entity.class, b_Id);
		b1.setB_Model(B.getB_Model());
		b1.setB_Price(B.getB_Price());
		s.merge(b1);
		tr.commit();
		s.close();
		return "data is update...!";
	}

	public List<Bike_Entity> getAllRecord() {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		HibernateCriteriaBuilder hcb = s.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Bike_Entity> root = cq.from(Bike_Entity.class);
		cq.select(root);
		Query query = s.createQuery(cq);
		List<Bike_Entity> list = query.getResultList();
		return list;
	}

	public Bike_Entity getSingleRecord(int b_Id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Bike_Entity b2 = s.get(Bike_Entity.class, b_Id);
		tr.commit();
		s.close();
		return b2;
	}
}
