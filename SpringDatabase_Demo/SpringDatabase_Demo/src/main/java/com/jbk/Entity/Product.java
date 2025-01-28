package com.jbk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int p_id;
	private String p_name;
	private String p_type;
	private long p_price;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public long getP_price() {
		return p_price;
	}
	public void setP_price(long p_price) {
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_type=" + p_type + ", p_price=" + p_price + "]";
	}
	public Product(int p_id, String p_name, String p_type, long p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_type = p_type;
		this.p_price = p_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
