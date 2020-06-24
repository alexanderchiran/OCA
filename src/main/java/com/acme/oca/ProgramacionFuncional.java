package com.acme.oca;

import java.util.ArrayList;
import java.util.List;

public class ProgramacionFuncional {
	
	/*
	List listA = new ArrayList();
	List listB = new LinkedList();
	List listC = new Vector();
	List<String> listD = new Stack();
	*/
	
	private List<String> cities;
	
	public static void main(String Args[]) {
		ProgramacionFuncional programacionFuncional = new ProgramacionFuncional();
		programacionFuncional.foundCity();
	}
	
	public ProgramacionFuncional() {
		cities = new ArrayList<>();
		cities.add("a");
		cities.add("b");
		cities.add("c");
		cities.add("d");
		cities.add("Chicago");
		cities.add("Bogotá");
	}
	
	public void foundCity() {
		boolean found = false;
		for (String city : cities) {
			if(city.equals("Chicago")) {
				found= true;
				break;
			}
		}
		System.out.println("1. Found Chicago?: "+found);
		
		System.out.println("2. Found Chicago?: "+cities.contains("Chicago"));
		
		boolean found2 = cities.stream().anyMatch(city -> city.equals("Chicago"));
		System.out.println("3. Found CHicago?: "+found2);
	}
	

}
