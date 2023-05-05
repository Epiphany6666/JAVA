package com.HomeWork.homework05;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void PrintSal() {
        System.out.println("工人 ");
        super.PrintSal();
    }
}
