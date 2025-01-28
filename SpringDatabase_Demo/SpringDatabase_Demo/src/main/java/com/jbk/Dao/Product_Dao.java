package com.jbk.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Entity.Product;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class Product_Dao {

	@Autowired
	SessionFactory factory;

	public String insertData(Product P) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		s.persist(P);
		tr.commit();
		s.close();
		return "Data is Inserted";
	}

	public String deleteData(int p_id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();
		Product p1 = s.get(Product.class, p_id);
		s.remove(p1);
		tr.commit();
		s.close();
		return "Data is deleted...!";
	}
	
	public String updateData(Product P, int p_id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Product p1 = s.get(Product.class, p_id);
		p1.setP_name(P.getP_name());
		p1.setP_type(P.getP_type());
		p1.setP_price(P.getP_price());
		s.merge(p1);
		tr.commit();
		s.close();
		return "data is update...!";
	}
	
	public List<Product> getAllRecord() {
		Session s= factory.openSession();
		Transaction tr= s.beginTransaction();
		HibernateCriteriaBuilder hcb= s.getCriteriaBuilder();
		CriteriaQuery<Object> cq= hcb.createQuery();
		Root<Product> root=cq.from(Product.class);
		cq.select(root);
		Query query= s.createQuery(cq);
		List<Product> list= query.getResultList();
		return list;
	}
	
	public Product getSingleRecord(int p_id) {
	    Session s = factory.openSession();
	    Transaction tr = s.beginTransaction();
	    Product p2= s.get(Product.class, p_id);
	        tr.commit();
	        s.close();
			return p2;
		}

}
