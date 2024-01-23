package com.ssafy.day5.b_interface;

public class IronMan implements Heroable{
	public void changeShape() {
		
	}
	
	public void fight() {
		
	}
	
	public void upgrade() {
		
	}
	
	public static void main(String[] args) {
		Parent.method();
		
		Parent p = new Parent();
		p.method();
		
		Parent p2 = new Child();
		p2.method();
		
		Child c = new Child();
		c.method();
		
		System.out.println('1' - 0);
}
}

class Parent{
	static void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	static void method() {
		System.out.println("child method");
	}
}

