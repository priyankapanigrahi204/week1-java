package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String name;
	int age;
	public Employee(int i, String string, int j) {
		super();
		this.id = id;
        this.name = name;
        this.age = age;
		// TODO Auto-generated constructor stub
	}
	public int  getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

public static void main(String args[]){
	
	List<Employee> list = Arrays.asList(
	        new Employee(1, "Gerhard", 20),
	        new Employee(2, "Peter", 50),
	        new Employee(3, "Andriya", 35),
	        new Employee(4, "Ashja", 40)
	        );
	System.out.println("Id:");
	/*List<Employee> listOfEmployeeids=list.stream()
            .map(e ->{	
            e.getId();
            return e; })
            .collect(Collectors.toList());*/
	 List<Integer> listOfEmployeeids=list.stream()
             .map(e -> e.getId()) 
             .collect(Collectors.toList());
	 listOfEmployeeids.forEach(System.out::println);
	
	listOfEmployeeids.forEach(System.out::println);
System.out.println(listOfEmployeeids);
	 
}


}
