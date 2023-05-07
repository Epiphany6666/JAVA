package com.HomeWork.HomeWork11;

public class HomeWork11 {
    public static void main(String[] args) {
        Person jack = new Student("jack");//向下转型
        jack.run();
        jack.run();//此时会动态绑定，不需要向下转型
        ((Student)jack).study();
    }
}
