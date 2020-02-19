package com.roa.testng;

import org.testng.annotations.Test;

public class DependTest {

    //这是依赖测试，当test1执行失败，test2则被忽略不执行，可用于登录成功后才能购买等有依赖关系的场景
    @Test
    public void test1(){
        System.out.println("这是test1运行了");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("这是test2运行了");
    }
}
