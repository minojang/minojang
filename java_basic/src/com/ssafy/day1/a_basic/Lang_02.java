package com.ssafy.day1.a_basic;

import java.math.BigDecimal;

public class Lang_02 {
    public static void main(String[] args) {
        float f1 = 2.0f;
        float f2 = 1.1f;
        float f3 = f1 - f2;
        System.out.println(f3);	//0.9

        double d1 = 2.0;
        double d2 = 1.1;
        double d3 = d1 - d2;
        System.out.println(d3);	//0.89999..
        // double은 부동소수점 형태.
        // 부동소수점 연산은 근삿값으로 나옴.

        System.out.println(((int) (d1 * 100) - (int) (d2 * 100)) / 100.0);
        //때문에 유효 숫자 를 이용한 반올림 처리 
        BigDecimal b1 = new BigDecimal("2.0");
        BigDecimal b2 = new BigDecimal("1.1");
        System.out.println("BigDecimal을 이용한 빼기 : " + b1.subtract(b2));
        
        /*
         * 묵시적 형변환 : 자료형이 작은것 -> 큰 것으로 변할 때에는 ㅇㅋ
         * byte - short, char - int - long - float - double
         * - long은 64bit, float은 32bit 이지만 float은 부동소수점이라 float이 더 큰 범위
         * - short, char간 변환은 양수, 음수일때가 다름 : char은 unsigned이고 short의 양수범위보다 큼
         * - 따라서 상호 명시적 캐스팅 필요
         */
    }
}
