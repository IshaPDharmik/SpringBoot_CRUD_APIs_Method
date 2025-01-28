package com.jbk.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Entity.Animals_Entity;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class Animals_Dao {

	@Autowired
	SessionFactory factory;

	public String insertData(Animals_Entity A) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		s.persist(A);
		tr.commit();
		s.close();
		return "Data is inserted..!";
	}

	public String deleteData(int a_ID) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Animals_Entity a1 = s.get(Animals_Entity.class, a_ID);
		s.remove(a1);
		tr.commit();
		s.close();
		return "Data is deleted...!";
	}

	public String updateData(Animals_Entity A, int a_ID) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Animals_Entity a1 = s.get(Animals_Entity.class, a_ID);
		a1.setA_Name(A.getA_Name());
		a1.setA_Color(A.getA_Color());
		s.merge(a1);
		tr.commit();
		s.close();
		return "data is update....!";
	}

	public List<Animals_Entity> getAllRecord() {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		HibernateCriteriaBuilder hcb = s.getCriteriaBuilder();
		CriteriaQuery<Object> cq = hcb.createQuery();
		Root<Animals_Entity> root = cq.from(Animals_Entity.class);
		cq.select(root);
		Query query = s.createQuery(cq);
		List<Animals_Entity> list = query.getResultList();
		return list;
	}

	public Animals_Entity getSingleRecord(int a_ID) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Animals_Entity a2 = s.get(Animals_Entity.class, a_ID);
		tr.commit();
		s.close();
		return a2;
	}
}
