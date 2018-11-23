package com.shangshi;

public class RealSubject implements Subject {
    public String doSomething(int type) {
        System.out.println("call doSomething()");
        if (type == 1) {
            return "Chinese";
        } else {
            return "English";
        }
    }

    public void sing() {
        System.out.println("sing()");
    }
}
