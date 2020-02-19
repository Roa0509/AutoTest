package com.roa.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候会用到异常异常测试？
     * 1、在我们期望结果为某一异常的时候
     * 2、我们传入了某些不合法的参数，程序会抛了异常
     * 3、也就是说我的语句结果就是这个异常
     */

    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个执行结果为失败的异常测试，因为执行结果没有报出RunTimeException异常");
    }

    //这是一个测试结果会成功过的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个执行结果会成功的异常测试，因为执行结果抛出了RunTimeException异常");
        throw new RuntimeException();
    }
}
