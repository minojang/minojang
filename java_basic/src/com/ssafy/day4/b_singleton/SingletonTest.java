package com.ssafy.day4.b_singleton;

class SingletonClass extends Object{
  
	private SingletonClass() {
		super();	//extend와 super()를 굳이 해줘야 하나?
					//자동으로 된다며
	}
	
	private static SingletonClass instance = new SingletonClass();
	public static SingletonClass getInstance() {
		return instance;
	}
	
  public void sayHello() {
    System.out.println("Hello");
  }
}

public class SingletonTest {
  public static void main(String[] args) {
	  SingletonClass sc = SingletonClass.getInstance();
	  sc.sayHello();
	  
	  SingletonClass sc2 = SingletonClass.getInstance();
  }
}
