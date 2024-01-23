package com.ssafy.day4.c_polymorphism;

import com.ssafy.day3.a_inheritance.Person;
import com.ssafy.day3.a_inheritance.SpiderMan;

public class InstanceOfTest {
    private void unsafeCasting() {
        Object obj = 1;
        //ClassCastException 발생
        //String s = (String) obj;	//int -> String
        //System.out.println(s.length());
        if ( obj instanceof String) {
        	String s = (String) obj;
        	System.out.println(s.length());
        }
        
    }

    private void safeCasting() {
        // TODO: 위 메서드가 안전하게 형 변환할 수 있도록 수정해보자.

        // END
    }

    public static void main(String[] args) {
        InstanceOfTest instance = new InstanceOfTest();
        instance.unsafeCasting();
        instance.safeCasting();
    }

}
