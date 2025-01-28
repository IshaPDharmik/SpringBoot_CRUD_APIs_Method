package com.jbk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cycle")
public class Cycle_Entity {

	@Id
	private int C_ID;
	private String C_Model;
	private String C_Color;
	private long C_Price;

	public int getC_ID() {
		return C_ID;
	}

	public void setC_ID(int c_ID) {
		C_ID = c_ID;
	}

	public String getC_Model() {
		return C_Model;
	}

	public void setC_Model(String c_Model) {
		C_Model = c_Model;
	}

	public String getC_Color() {
		return C_Color;
	}

	public void setC_Color(String c_Color) {
		C_Color = c_Color;
	}

	public long getC_Price() {
		return C_Price;
	}

	public void setC_Price(long c_Price) {
		C_Price = c_Price;
	}

	public Cycle_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cycle_Entity(int c_ID, String c_Model, String c_Color, long c_Price) {
		super();
		C_ID = c_ID;
		C_Model = c_Model;
		C_Color = c_Color;
		C_Price = c_Price;
	}

	@Override
	public String toString() {
		return "Cycle_Entity [C_ID=" + C_ID + ", C_Model=" + C_Model + ", C_Color=" + C_Color + ", C_Price=" + C_Price
				+ "]";
	}

}