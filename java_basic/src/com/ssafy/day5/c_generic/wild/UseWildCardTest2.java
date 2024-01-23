package com.ssafy.day5.c_generic.wild;

import com.ssafy.day5.c_generic.box.GenericBox;

public class UseWildCardTest2 {

    public void useWildCardTypeMethod() {
        GenericBox<Double> dBox = new GenericBox<>();
        dBox.setSome(3.14);
        printInfo(dBox);

        GenericBox<Integer> iBox = new GenericBox<>();
        iBox.setSome(3);
        printInfo(iBox);

    }

    // TODO:GenericBox<Double>과 GenericBox<Integer>의 내용을 확인하는 메서드를 작성해보자.
     public void printInfo(GenericBox<? extends Number> wild){
    	 //T 타입의 값을 꺼내서 사용하는 경우
    	 System.out.println("정수 : " + wild.getSome().intValue() + 
    			 "실수 : " + wild.getSome().doubleValue());
    	 
    	 //T타입의 멤버를 세팅하는 경우
    	 //wild.setSome(10);
    	 
    	 //값을 사용할 순 있지만 세팅은 안된다.
    	 // ? extends Number -> ? super Number 로 바꾸면 반대가됨,
     }

    // END

    public static void main(String[] args) {
        UseWildCardTest2 test = new UseWildCardTest2();
        test.useWildCardTypeMethod();
    }
}
