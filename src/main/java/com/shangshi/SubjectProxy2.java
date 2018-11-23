package com.shangshi;

/**
 * 模拟如果用静态代理类，需要每种Subject类都需要手动添加一个静态代理类
 */
public class SubjectProxy2 implements Subject {
    Subject subject = new RealSubject2();

    public String doSomething(int type) {
        System.out.println("模拟日志");
        return subject.doSomething(type);
    }

    public void sing() {

    }
}
