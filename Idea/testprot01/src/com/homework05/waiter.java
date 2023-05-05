package com.HomeWork.homework05;

public class waiter extends Employee {
    public waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void PrintSal() {
        System.out.print("服务生 ");
        super.PrintSal();
    }
}
