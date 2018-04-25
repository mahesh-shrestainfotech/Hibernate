package com.mtc.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	
	@Id
	private int id;
	private String name;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SupplierId : "+id+" SupplierName : "+name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
