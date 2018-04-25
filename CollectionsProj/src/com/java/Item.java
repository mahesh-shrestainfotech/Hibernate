package com.java;

public class Item implements Comparable<Item>{
	
	private int id;
	private String name;
	private float price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
		
	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(Item i2) {
		
		if(this.id > i2.id) {
			return 1;
		}else if(this.id < i2.id) {
			return -1;
		}
		
		return 0;
	}

	static public int comparePrice(Item i1,Item i2) {
		
		if(i1.price > i2.price) {
			return 1;
		}else if(i1.price < i2.price) {
			return -1;
		}
		
		return 0;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0) {
			this.id = id;
			return;
		}
		
		System.err.println("Invalid id");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	
}
