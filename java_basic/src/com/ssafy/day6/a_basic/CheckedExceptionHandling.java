package com.ssafy.day6.a_basic;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        // TODO: 다음에서 발생하는 예외를 처리해보자.
    	try {
    		Class.forName("com.ssafy.day6.a_basic.CheckedExceptionHandling");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			// new FileInputStream("some");
		}
    	
    	// 
        // END
        System.out.println("프로그램 정상 종료");
    }

}
