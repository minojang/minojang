package com.ssafy.day3.c_modifier.access.p1;

public class Parent {	
	//public : 같은 패키지 외에서도 해당 클래스를 import할 수 있게 해
    //public과 package의 차이점?
	public int publicVar;
    protected int protectVar;
    int defaultVar;
    @SuppressWarnings("unused")
    private int privVar;

    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        this.defaultVar = 10;
        this.privVar = 10;
    }
}
