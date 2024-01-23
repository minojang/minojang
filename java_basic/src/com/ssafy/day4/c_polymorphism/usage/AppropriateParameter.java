package com.ssafy.day4.c_polymorphism.usage;

import com.ssafy.day3.a_inheritance.person.Person;
import com.ssafy.day3.a_inheritance.person.SpiderMan;

public class AppropriateParameter {
    public void useJump1(Object obj) {
        if (obj instanceof SpiderMan) {
            SpiderMan casted = (SpiderMan) obj;
            casted.jump();
        }
    }

    public void useJump2(SpiderMan person) {
        person.jump();
    }

    public void useJump3(SpiderMan spiderMan) {
        spiderMan.jump();
    }

    public static void main(String[] args) {
        Object obj = new Object();
        SpiderMan person = new SpiderMan();
        SpiderMan sman = new SpiderMan();

        AppropriateParameter ap = new AppropriateParameter();
        // TODO:ap의 useJumpX를 obj, person, sman으로 호출해보세요.

        // END

    }

}
