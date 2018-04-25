import java.util.Collections;
import java.util.TreeSet;

import com.java.Item;

public class TestTreeSet {

	public static void main(String[] args) {

		
		
		//TreeSet<Item> items = new TreeSet<>((Item i1,Item i2) -> { return i1.getName().compareTo(i2.getName()); });
		
		TreeSet<Item> items = new TreeSet<>(Item::comparePrice);
		
		items.add(new Item(102,"iPhone", 500));
		items.add(new Item(101,"BlackBerry",400));		
		items.add(new Item(103,"Pixel2", 450));
		items.add(new Item(104,"Samsung", 300));
		
		
		
		for (Item item : items) {
			
			System.out.println("Id    : "+item.getId());
			System.out.println("Name  : "+item.getName());
			System.out.println("Price : "+item.getPrice());
			System.out.println();
		}
		
//		TreeSet<String> names = new TreeSet<>();
//		
//		names.add("Kumar");
//		names.add("Hary");
//		names.add("Mike");
//		names.add("Anil");
//		names.add("Steve");
//		names.add("Hary");
//		names.add("Mary");
//
//		for (String str : names) {
//			System.out.println(str);
//		}

		
		
	}

}
