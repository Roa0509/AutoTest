package com.roa.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("Ignore1 执行了");
    }

    //忽略测试：enabled参数为false（不写时默认为true）时 忽略该测试
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("Ignore2 执行了");
    }
}
