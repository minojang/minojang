package com.ssafy.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] doubles = {-0.5, 2.10, 30.11, -10.22, 13.44};
		String[] strs = {"ㄹ", "ㅇ","ㄷ","ㄴ","ㅎ","ㄲ"};
		List<Double> doublesList = new ArrayList<Double>();
		List<String> strsList = new ArrayList<>();
		for ( double d : doubles) {
			doublesList.add(d);
		}
		for ( String d : strs) {
			strsList.add(d);
		}
		Collections.sort(doublesList, new DoubleComparator());
		Collections.sort(strsList);
		System.out.println(doublesList);
		System.out.println(strsList);
		
		
		Employee[] emps = {
				new Employee("5","설한결","no.1", 5000),
				new Employee("2","남궁소라","no.2", 3000),
				new Employee("3","오버들","no.3", 1000),
				new Employee("1","탁아람","no.3", 1000),
				new Employee("7","권철", "no.4", 500),
				new Employee("4","유바다","no.4", 500),
				new Employee("6","풍우람","no.4", 500),
			};
		
		List<Employee> emp= new ArrayList<>();
		for ( Employee e : emps ) {
			emp.add(e);
		}
		Collections.sort(emp, new EmployeeComparator());
		for ( Employee e : emp ) {
			System.out.println(e.name);
		}
		
	}

}

class Employee {
	 String en;    //사번
	 String name;  //이름
	 String level; //직책
	 int salary;   //월급
	 
	 

  public Employee(String en, String name, String level, int salary){
		this.en = en;
		this.name = name;
		this.level = level;
		this.salary = salary;
	}

	//getter setter 작성
	//...

	//toString 작성
	//...
}

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (Integer.parseInt(o1.en) <Integer.parseInt(o2.en)) return -1;
		else return 1;
		
	}
	
}
class DoubleComparator implements Comparator<Double> {

	@Override
	public int compare(Double o1, Double o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1, o2);
	}
	
}
