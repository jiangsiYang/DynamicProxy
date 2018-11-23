package com.shangshi;

public class TestStaticProxy {
    public static void main(String args[])
    {
        Subject sub = new SubjectProxy();
        String result = sub.doSomething(1);
        System.out.println(result);

        Subject sub2 = new SubjectProxy2();
        String result2 = sub2.doSomething(2);
        System.out.println(result2);
    }
}
