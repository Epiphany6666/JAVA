package com.HomeWork.HomeWork03;

public class professor extends HomeWork03{
    public professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
