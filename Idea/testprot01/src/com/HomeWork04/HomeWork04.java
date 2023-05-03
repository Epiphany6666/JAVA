package com.HomeWork.HomeWork04;

public class HomeWork04 {
    public static void main(String[] args) {
        Manager xm = new Manager("xm", 200, 20, 1.2);
        xm.setBonus(3000);
        xm.PrintSalary();
        Employee xx = new Employee("xx", 100, 500, 1.0);
        xx.PrintSalary();
    }
}
