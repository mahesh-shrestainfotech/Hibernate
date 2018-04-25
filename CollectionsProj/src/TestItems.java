import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.java.Item;
import com.java.ItemNameComparator;
import com.java.ItemPriceComparator;

public class TestItems {

	public static void main(String[] args) {
		
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item(102,"iPhone", 500));
		items.add(new Item(101,"BlackBerry",400));		
		items.add(new Item(103,"Pixel2", 450));
		items.add(new Item(104,"Samsung", 300));
		
		//Collections.sort(items);
		
		//Collections.sort(items,new ItemPriceComparator());
		
    	//	Collections.sort(items,new ItemNameComparator());
		
//		Comparator<Item> comparator = new Comparator<Item>() {
//			
//			@Override
//			public int compare(Item i1, Item i2) {
//				
//				return i1.getName().compareTo(i2.getName());
//			}
//		};
		
		
		//Comparator<Item> comparator = (Item i1,Item i2) -> { return i1.getName().compareTo(i2.getName()); }; 
		
		//Collections.sort(items,(Item i1,Item i2) -> { return i1.getName().compareTo(i2.getName()); });
		
		Item itemRef = new Item();
		
		Collections.sort(items,Item::comparePrice);		
		
		for (Item item : items) {
			
			System.out.println("Id    : "+item.getId());
			System.out.println("Name  : "+item.getName());
			System.out.println("Price : "+item.getPrice());
			System.out.println();
		}
		
		
		
	}

}
