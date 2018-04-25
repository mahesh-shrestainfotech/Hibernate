

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.Item;

public class TestStreams {

	public static void main(String[] args) {
	
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item(102,"iPhone6", 500));
		items.add(new Item(101,"BlackBerry",400));		
		items.add(new Item(103,"Pixel2", 450));
		items.add(new Item(104,"Samsung", 300));
		items.add(new Item(105,"Pixel", 450));
		items.add(new Item(106,"iPhone7", 500));
		
		List<String> names = new ArrayList<>();
		
		//external iteration
//		for (Item item : items) {
//			if(item.getName().startsWith("P")) {
//				names.add(item.getName());
//			}
//		}
//
//		System.out.println(names);
		
		Stream<Item> stream = items.stream();
		
		//List<String> itemNames = stream.filter(item -> item.getName().startsWith("P")).map(Item::getName).collect(Collectors.toList());
		
		List<String> itemNames = stream.filter(item -> item.getPrice() > 400).map(Item::getName).collect(Collectors.toList());
		
		System.out.println(itemNames);
		
	}

}
