
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();

		names.add("Anil");//0
		names.add("Kumar");//1
		names.add("Hary");//2
		names.add("Mike");//3
		names.add("Steve");//4
		names.add("Raj");//5
		names.add("Mary");//6
		
		Collections.sort(names);
		
		for (String str : names) {
			System.out.println(str);
		}

		
//		List<String> namesList = names.subList(2,5);
//		
//		for (String str : namesList) {
//			System.out.println(str);
//		}
		
//		//names.set(2,"Charle");
//		names.add(2,"Charle");
//		

		
		//System.out.println(names.get(2));
		
		
		
//		LinkedList<String> names2 = new LinkedList<>();
//		
//		names2.add("Kumar");
//		names2.add("Raj");
//		names2.add("Jhon");
//		names2.add("Hary");
//		names2.add("Steve");
//		
//		Iterator<String> iterator = names.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		//names.addAll(names2);
		
		//names.removeAll(names2);
		
		//names.retainAll(names2);
		
//		System.out.println(names.containsAll(names2));
//		
//		
//		for (String str : names) {
//			System.out.println(str);
//		}
		
//		String[] namesArray = new String[names.size()];
//		
//		names.toArray(namesArray);
//		
//		for (String str : namesArray) {
//			System.out.println(str);
//		}
		
		

//		Object[] objectsArr = names.toArray();
//
//		for (Object object : objectsArr) {
//			String str = (String) object;
//			System.out.println(str);
//		}
		
		

		// System.out.println(names.size());
		//
		// System.out.println(names.contains("Hary"));

	}

}
