package com.chapter10.HomeWork.HomeWork04;

public class Cellphone{
    public void testWork(Computer computer, int n1, int n2){//不仅要接收接口类型，还要接收两个值
        int result = computer.work(n1, n2);
        System.out.println(result);
    }
}
