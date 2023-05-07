package com.HomeWork.HomeWork11;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("student run");
    }

    public void study() {
        System.out.println("student study..");
    }
}
