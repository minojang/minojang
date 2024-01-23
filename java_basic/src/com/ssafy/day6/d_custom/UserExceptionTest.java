package com.ssafy.day6.d_custom;

public class UserExceptionTest {
	private static String[] fruits = { "사과", "오렌지", "토마토" };

	public static void main(String[] args) {
		boolean result = getFruit1("사과");
		if (!result) {
			System.out.println("사과는 없습니다.");
		}
		result = getFruit1("사과");
		if (!result) {
			System.out.println("사과는 없습니다.");
		}
		// TODO: 2. getFruit2를 이용해서 오렌지 2개를 소비해서 예외 상황을 테스트 하시오.
		try {
			getFruit2("오렌지");
			getFruit2("오렌지");
		} catch (FruitNotFoundException e) {
			e.printStackTrace();
			
			String msg = e.getMessage();
			System.out.println("오류 메세지 : " + msg);
		}
		
		String str = null;
		System.out.println(str.charAt(0));
		throw new NullPointerException();
		// END

		// TODO: 4. 수박, 멜론, 복숭아을 저장해서 예외 상황을 테스트 하시오.
	}

	private static boolean getFruit1(String name) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] != null && fruits[i].equals(name)) {
				fruits[i] = null;
				return true;
			}
		}
		return false;
	}
	// TODO: 1. getFruit1을 참조하여 예외를 활용하는 형태로 getFruit2를 작성하시오.
	private static void getFruit2(String name) throws FruitNotFoundException{
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] != null && fruits[i].equals(name)) {
				fruits[i] = null;
				return;
			}
		}
		
		throw new FruitNotFoundException("사과");
	}
	// END

	// TODO: 3. 배열의 null인 지점에 과일을 저장하도록 작성하시오.

	// END

}
