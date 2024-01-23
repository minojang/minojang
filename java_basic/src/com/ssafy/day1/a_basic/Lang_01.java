package com.ssafy.day1.a_basic;

public class Lang_01 {
    public static void main(String[] args) {
        //int의 최댓값에 1 더하기
    	int i1 = Integer.MAX_VALUE;

        int i2 = i1 + 1;
        
        System.out.println(i2);
        // stack overflow 발생 : -2147483648
        // 오버플로우가 발생하면 최솟값으로 wrap-around(값이 감소하여 최소값으로 돌아감) 
    }
}
