package com.shangshi;

public class TestCGLibProxy {
    public static void main(String args[]) {
        Subject subject = CGLibProxy.getInstance().getProxy(RealSubject.class);
        String result = subject.doSomething(1);
        System.out.println(result);


        Subject subject2 = CGLibProxy.getInstance().getProxy(RealSubject2.class);
        String result2 =subject2.doSomething(2);
        System.out.println(result2);

    }
}
