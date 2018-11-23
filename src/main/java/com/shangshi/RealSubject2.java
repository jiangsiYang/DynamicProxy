package com.shangshi;

/**
 * 如果这时候增加其它实现Subject的类，这些类都需要
 */
public class RealSubject2 implements Subject {
    public String doSomething(int type) {
        System.out.println("call RealSubject2 doSomething()");
        if (type == 1) {
            return "RealSubject2 Chinese";
        } else {
            return "RealSubject2 English";
        }
    }

    public void sing() {

    }
}
