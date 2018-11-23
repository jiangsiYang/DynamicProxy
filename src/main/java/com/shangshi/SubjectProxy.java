package com.shangshi;

/**
 * 静态代理类
 * 我们需要给RealSubject类增加一个记录日志的功能，这时候可以用静态代理类来完成
 * 当然我们也可以直接修改RealSubject类达到目的，但是我们有可能有RealSubject2、RealSubject3等多种实现类，一一修改太过繁琐且易出错，
 * 况且将来还可能添加权限检查，异常处理等功能，所以显然用代理类更好一点。
 *
 * 但如果真有多个实现类，都要加入日志功能，使用静态代理虽然也能实现，但是也是略显繁琐，需要手动一一创建代理类，这时候我们可以通过
 * 使用动态代理来完成
 */
public class SubjectProxy implements Subject {
    Subject subject = new RealSubject();

    public String doSomething(int type) {
        System.out.println("模拟日志");
        return subject.doSomething(type);
    }

    public void sing() {

    }
}
