package com.ssafy.day3.a_inheritance;

public class Person {
	String name;
	Person ( String name ) {
		this.name = name;
	}
	public Person() {}
	
	@Override
	public String toString() {
		return  "사람 이름: " + this.name;
	}
}

 class Spider {
	Spider() {
		
	}
}