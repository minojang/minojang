package com.ssafy.day4.c_polymorphism.usage;

import com.ssafy.day3.a_inheritance.Person;
import com.ssafy.day3.a_inheritance.SpiderMan;

public class PolymorphismUsage {
    public void useObjectArray() {
        Object[] objs = new Object[4];
        objs[0] = "Hello";
        objs[1] = objs;
        objs[2] = new SpiderMan();
        objs[3] = 3;	//Auto Boxing
        //objs[3] = Integer.valueOf(3);
        
        for( Object obj: objs) {
        	System.out.println(obj.getClass().getName());
        }
    }

    public void useObjectParam() {
        System.out.println(1);
        System.out.println("Hello");
        System.out.println(new SpiderMan());
        System.out.println(new SpiderMan());
    }

    public static void main(String[] args) {
        PolymorphismUsage usage = new PolymorphismUsage();
        usage.useObjectArray();
        usage.useObjectParam();
    }
}
