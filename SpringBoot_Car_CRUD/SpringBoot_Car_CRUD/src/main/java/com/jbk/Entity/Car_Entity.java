package com.jbk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car_Entity {

	@Id
	private int c_Id;
	private String c_Model;
	private long c_Price;

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getC_Model() {
		return c_Model;
	}

	public void setC_Model(String c_Model) {
		this.c_Model = c_Model;
	}

	public long getC_Price() {
		return c_Price;
	}

	public void setC_Price(long c_Price) {
		this.c_Price = c_Price;
	}

	public Car_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car_Entity(int c_Id, String c_Model, long c_Price) {
		super();
		this.c_Id = c_Id;
		this.c_Model = c_Model;
		this.c_Price = c_Price;
	}

	@Override
	public String toString() {
		return "Car_Entity [c_Id=" + c_Id + ", c_Model=" + c_Model + ", c_Price=" + c_Price + "]";
	}

}
