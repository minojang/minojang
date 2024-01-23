package com.ssafy.day6.d_custom;

public class FruitNotFoundException extends Exception{
	
	String fruitName;
	
	public void showFruitName() {
		System.out.println("과일 이름 : " + fruitName);
	}
	public FruitNotFoundException(String name) {
		super(name +  " 에 해당하는 과일은 없습니다");
		
	}
}
