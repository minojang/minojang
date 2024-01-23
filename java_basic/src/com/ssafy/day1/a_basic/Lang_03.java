package com.ssafy.day1.a_basic;

public class Lang_03 {
    public static void main(String[] args) {
        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        System.out.println(i2);

        long l1 = i1 + 1;
        System.out.println(l1);	// -2147.....48

        long l2 = (long) (i1 + 1);
        System.out.println(l2);// -2147.....48

        long l3 = (long) i1 + 1;
        System.out.println(l3);	// 2147.....48

        int i3 = 1000000 * 1000000 / 100000;
        int i4 = 1000000 / 100000 * 100000;
        System.out.println(i3 + " : " + i4);	// -7273 : 1000000
        
        int x = 8;
        int y = 8 >> 9 % 2 / 3 * 2 == 2 ? 0 : 1; 
        // 연산 순서 : 9% 2 -> 1 / 3 -> 1*2 -> 8 >> 1 -> 2 == 2 -> y = 0
        System.out.println(8 >> 1 / 6); //8
    }
}
