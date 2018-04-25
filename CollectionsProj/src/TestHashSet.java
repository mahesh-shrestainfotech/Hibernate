

import java.util.HashSet;
import java.util.LinkedList;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<>();

		names.add("Anil");//0
		names.add("Kumar");//1
		names.add("Hary");//2
		names.add("Mike");//3
		names.add("Steve");//4
		names.add("Hary");//5
		names.add("Mary");//6

//		for (String str : names) {
//			System.out.println(str);
//		}
		
		String s1 = "Good Morning";
		String s2 = "Good Morning";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		
		

	}

}
