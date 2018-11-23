package com.shangshi;

/**
 * CGLib动态代理测试
 */
public class TestCGLibProxy {
    public static void main(String args[]) {
        Subject subject = CGLibProxy.getInstance().getProxy(RealSubject.class);
        //研究一下这个subject，发现这个对象的类型是com.shangshi.RealSubject$$EnhancerByCGLIB$$1f2b4198,这是CGLIB动态生成的类型,父类是com.shangshi.RealSubject，印证了CGLIB是通过继承实现代理；同时实现了net.sf.cglib.proxy.Factory接口，这个接口是CGLIB自己加入的，包含一些工具方法。
        String result = subject.doSomething(1);
        System.out.println(result);


        Subject subject2 = CGLibProxy.getInstance().getProxy(RealSubject2.class);
        String result2 =subject2.doSomething(2);
        System.out.println(result2);

    }
}
