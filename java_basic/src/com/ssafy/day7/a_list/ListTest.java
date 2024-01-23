package com.ssafy.day7.a_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    // 문자열을 저장할 List, 구현체는 ArrayList
	// List는 인터페이스
    List<String> friends = new ArrayList<>();

    public static void main(String[] args) {

        ListTest alt = new ListTest();
        alt.createTest();
        alt.retrieveTest();
        alt.updateTest();
        alt.deleteTest();
    }

    public void createTest() {
        // TODO: friends에 여러명의 친구를 등록해보자.
    	friends.add("홍길동");
    	friends.add("임꺽정");
    	friends.add(1, "장길산");	//index에 넣기
    	friends.add("홍길동");	//리스트 : 중복 가능
        // END
        System.out.println("추가 후 내용 출력: " + friends);
    }

    public void retrieveTest() {
        // TODO: 다양한 조회 기능을 사용해보자.
        //  혹시 비어있지는 않나? 요소의 개수는 ?
        //  반복을 이용한 요소 순회
        //  홍길동이 있다면 그 위치 출력
    	System.out.println(friends.isEmpty()+ " : " + friends.size());
    	//반복을 이용한 요소 순회
    	for (String name : friends) {
    		System.out.println(name);
    	}
    	//홍길동이 있다면 그 위치 출력
    	System.out.println(friends.indexOf("홍길동") + 
					" : " + friends.lastIndexOf("홍길동"));
        // END
    }

    public void updateTest() {
        // TODO: 홍길동이 있다면 값을 율도국 왕으로 변경해보자.
    	int idx = friends.indexOf("홍길동");
    	// 못찾으면 -1이 리턴된다
    	if (idx >= 0) {
    		friends.set(idx, "율도국왕");
    	}
    	System.out.println("수정 후 : " + friends);
        // END
    }

    public void deleteTest() {
        // TODO: 0번째 친구와 율도국 왕을 삭제하시오.
    	System.out.println(friends.remove(0));
    	System.out.println(friends.remove("율도국왕"));
        // END
        System.out.println("삭제 후 : " + friends);
        friends.clear();// 리스트 초기화
        System.out.println("초기화 후 : " + friends);
    }
    
    //Object랑 int가 두개가 들어간다면 Integer를 원소로 하는 값을 
    //지우려고하면 인덱스로 인식하나요 원소로 인식하나요?
    public void deleteTest2() {
    	List<Integer> nums = new ArrayList<>();
    	List<Integer> nums2 = new LinkedList<>();
    	nums.add(1);
    	nums.add(2);
    	
    	//인덱스가 삭제됨
    	nums.remove(1);
    }
}
