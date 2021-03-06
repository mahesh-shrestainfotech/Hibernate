package com.java;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item>{
	
	@Override
	public int compare(Item i1, Item i2) {
		
		if(i1.getPrice() > i2.getPrice()) {
			return 1;
		}else if(i1.getPrice() < i2.getPrice()) {
			return -1;
		}
		
		return 0;
	}

}
