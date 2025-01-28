package com.jbk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bike_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_Id;
	private String b_Model;
	private long b_Price;

	public int getB_Id() {
		return b_Id;
	}

	public void setB_Id(int b_Id) {
		this.b_Id = b_Id;
	}

	public String getB_Model() {
		return b_Model;
	}

	public void setB_Model(String b_Model) {
		this.b_Model = b_Model;
	}

	public long getB_Price() {
		return b_Price;
	}

	public void setB_Price(long b_Price) {
		this.b_Price = b_Price;
	}

	public Bike_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike_Entity(int b_Id, String b_Model, long b_Price) {
		super();
		this.b_Id = b_Id;
		this.b_Model = b_Model;
		this.b_Price = b_Price;
	}

	@Override
	public String toString() {
		return "Bike_Entity [b_Id=" + b_Id + ", b_Model=" + b_Model + ", b_Price=" + b_Price + "]";
	}

}
