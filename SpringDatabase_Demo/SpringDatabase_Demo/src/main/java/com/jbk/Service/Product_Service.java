package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Product_Dao;
import com.jbk.Entity.Product;

@Service
public class Product_Service {

	@Autowired
	Product_Dao dao;

	public String insertdata(Product P) {
		String msg = dao.insertData(P);
		return msg;
	}

	public String deletedata(int p_id) {
		String msg = dao.deleteData(p_id);
		return msg;
	}

	public String updatedata(Product P, int p_id) {
		String msg = dao.updateData(P, p_id);
		return msg;
	}

	public List<Product> getAllData() {
		List<Product> list = dao.getAllRecord();
		return list;
	}

	public Product getProduct(int p_id) {
		Product msg = dao.getSingleRecord(p_id);
		return msg;
	}
}
