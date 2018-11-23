package com.shangshi;

public class TestDynamicProxy {
    public static void main(String args[]) {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject subject = (Subject) proxyHandler.bind(new RealSubject());
        String result =  subject.doSomething(1);
        System.out.println(result);

        Subject subject2 = (Subject) proxyHandler.bind(new RealSubject2());
        String result2 =  subject2.doSomething(2);
        System.out.println(result2);
    }
}
