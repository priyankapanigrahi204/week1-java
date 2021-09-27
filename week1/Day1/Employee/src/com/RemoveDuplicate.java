package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String args[]){
		List<String> employees = new ArrayList<String>();
		
		employees.add("priyanka")	;
		employees.add("raj");
		employees.add("santun");
		employees.add("priyanka");
		
		System.out.println("original list employees:");
		employees.forEach(original-> System.out.println(employees));
		
		Set<String> uniqueset = employees.stream().collect(Collectors.toSet());
		System.out.println("unique employees");
		uniqueset.forEach(unique-> System.out.println(uniqueset));
	}

}
