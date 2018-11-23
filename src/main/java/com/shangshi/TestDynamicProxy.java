package com.shangshi;

public class TestDynamicProxy {
    public static void main(String args[]) {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject subject = (Subject) proxyHandler.bind(new RealSubject());
        //研究一下这个subject，发现这个对象的类型是com.sun.proxy.$Proxy0,父类是java.lang.reflect.Proxy，所有的JDK动态代理都会继承这个类；同时实现了interface com.shangshi.Subject接口，只是这里把它的超类转化为Subject类型
        String result =  subject.doSomething(1);
        System.out.println(result);

        Subject subject2 = (Subject) proxyHandler.bind(new RealSubject2());
        String result2 =  subject2.doSomething(2);
        System.out.println(result2);
    }
}
