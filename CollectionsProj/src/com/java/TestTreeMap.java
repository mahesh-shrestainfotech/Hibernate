package com.java;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TestTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String,String>  callingCodes = new TreeMap<>();
		
		callingCodes.put("IND", "091");
		callingCodes.put("US","001");
		callingCodes.put("UK","044");		
		callingCodes.put("AUS","006");
		callingCodes.put("SING","066");
		
		Set<Entry<String,String>> entries = callingCodes.entrySet();
		
		for (Entry<String, String> entry : entries) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		

	}

}
