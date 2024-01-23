package com.ssafy.day7.d_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ssafy.day7.b_set.SmartPhone;

public class ListSortTest {

    private List<String> names = Arrays.asList("Hi", "Java", "World", "Welcome");

    public void basicSort() {
        // TODO: names를 이름의 오름차순, 또는 그 역순으로 정렬해서출력하시오.
    	Collections.sort(names);
    	System.out.println(names);
        // END
    }

    public void sortPhone() {
        // TODO: 전화 번호에 따라 SmartPhone을 정렬해보자.
    	List<SmartPhone> phones = Arrays.asList(new SmartPhone("010"), 
    											new SmartPhone("111"),
    											new SmartPhone("001"));
    	// Comparable 인터페이스를 구현하지 않은 객체 SmartPhone
    	// 비교 불가 -> SmartPhone 클래스 수정
    	Collections.sort(phones);
        // END
    }

    public void stringLengthSort() {
        // TODO: 문자열의 길이에 따라 names를 정렬해보자.
    	// 방법 1 : 사용자 정의 Comparator
    	Collections.sort(names, new StringLengthComparator());
        // END
    	
    	//방법 2 : 한번 쓸 클래스를 굳이 만들지 않고 익명 클래스 제작
    	Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
    		
    	});
    	
    	// 방법 3 : lambda 함수
    	Collections.sort(names, (o1, o2) -> );
        System.out.println(names); // [Hi, Java, World, Welcome]
    }

    public static void main(String[] args) {
        ListSortTest st = new ListSortTest();
        // st.basicSort();
        st.sortPhone();
        // st.stringLengthSort();
    }

}
