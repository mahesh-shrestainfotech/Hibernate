package com.java;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestMapTask {

	public static void main(String[] args) {

		      // key  , city names
		HashMap<String,List<String>> cityAndBranchNames = new HashMap<>();
		
		cityAndBranchNames.put("Hyd", Arrays.asList(new String[] {"AVNT","MTN","PATNY"}));
		cityAndBranchNames.put("Mum", Arrays.asList(new String[] {"CG","Bandra","Dadar","Thane"}));
		cityAndBranchNames.put("Vizag", Arrays.asList(new String[] {"BR","BC","MT"}));
		
		

	}

}
