package com.ssafy.day6.a_basic;

public class SimpleException {
    public static void main(String[] args) {
    	//  java.lang.ArrayIndexOutOfBoundsException : checked Exception
    	int[] intArray = { 10 };
    	try {
    		System.out.println(intArray[2]);
        } catch ( ArrayIndexOutOfBoundsException e){
        	System.out.printf("예외 처리 : " );
        	e.printStackTrace();
        }
    	
        
        System.out.println("프로그램 종료합니다.");
    }
}
