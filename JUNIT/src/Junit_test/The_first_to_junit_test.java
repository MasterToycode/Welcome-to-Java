package Junit_test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Junit_test.The_first_to_junit.f;

public class The_first_to_junit_test {
    @Test//测试方法
  public void test_play(){
        int kobe = f("kobe");
        System.out.println(kobe);
        System.out.println(f(null));
        //断言机制,设置预定值和运行的结果进行比较！
        Assert.assertEquals("There are bugs",3,kobe);

    }
    @Before
    public void test_1(){
        System.out.println("test_2 before-");
    }
    @After
    public void test_2(){
        System.out.println("test_2 After-");
    }

}
