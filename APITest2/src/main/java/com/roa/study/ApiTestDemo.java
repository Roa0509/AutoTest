package com.roa.study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import sun.misc.JavaAWTAccess;

public class ApiTestDemo {
    //断言
    @Test
    public void testDemo1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void testDemo2(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void testDemo3(){
        Assert.assertEquals("aaa","aaa");
    }

    //日志
    @Test
    public void testDemo4(){
        Reporter.log("这是我自己添加的日志记录");
        throw new RuntimeException("这是我自己添加的异常记录");
    }
}
