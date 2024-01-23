package com.ssafy.day3.c_modifier.access.p2;

import com.ssafy.day3.c_modifier.access.p1.Parent;

// TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class OtherPackageChildClass extends Parent {
	    public void method() {
	    	this.publicVar = 10;
	    	this.protectVar = 10;
	    	this.defaultVar = 10;//왜됨?
	    	this.privVar = 10;
	    }
	    
	    public void method2() {
	    	Parent p = new Parent();
	    	p.publicVar = 10;
	    	p.protectVar = 10;
	    	p.defaultVar = 10;//왜됨?
	    	p.privVar = 10;
	    }
    // END
}
