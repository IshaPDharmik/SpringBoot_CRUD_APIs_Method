package com.jbk.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animals_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_ID;
	private String a_Name;
	private String a_Color;

	public int getA_ID() {
		return a_ID;
	}

	public void setA_ID(int a_ID) {
		this.a_ID = a_ID;
	}

	public String getA_Name() {
		return a_Name;
	}

	public void setA_Name(String a_Name) {
		this.a_Name = a_Name;
	}

	public String getA_Color() {
		return a_Color;
	}

	public void setA_Color(String a_Color) {
		this.a_Color = a_Color;
	}

	public Animals_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animals_Entity(int a_ID, String a_Name, String a_Color) {
		super();
		this.a_ID = a_ID;
		this.a_Name = a_Name;
		this.a_Color = a_Color;
	}

	@Override
	public String toString() {
		return "Animals_Entity [a_ID=" + a_ID + ", a_Name=" + a_Name + ", a_Color=" + a_Color + "]";
	}

	public String getName(Animals_Entity a1) {
		// TODO Auto-generated method stub
		return null;
	}

}
