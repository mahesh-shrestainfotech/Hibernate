package com.java;

public class Dish {
	
	private String name;
	private boolean vegetarian;
	private int calories;
	private Type type;
	
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	
	public boolean equals(Dish dish) {
		if(this.name.equals(dish.getName()) && this.vegetarian == dish.vegetarian && this.calories == dish.calories && this.type == dish.type) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Name : "+name+" Calories : "+calories+"\n";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	public enum Type{MEAT,FISH,OTHER};
	
	public enum CaloricLevel {DIET,NORMAL,FAT};
	
}

 