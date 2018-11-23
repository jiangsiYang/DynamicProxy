package com.shangshi;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，只需要写一个就能在所有需要的类上增加“记录日志”的功能
 */
public class ProxyHandler implements InvocationHandler {

    private Object tar;

    public Object bind(Object tar) {
        this.tar = tar;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //这里可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        System.out.println("模拟日志");
        result = method.invoke(tar, args);
        //在调用具体函数方法后，执行功能处理
        return result;
    }
}
