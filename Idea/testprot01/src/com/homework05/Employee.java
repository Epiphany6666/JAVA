package com.HomeWork.homework05;


public class Employee {
    private String name;
    private double salary;
    //带薪的月份
    private int salMonth = 12;//默认12个月，如果不够，用set

    public void PrintSal() {
        System.out.println(name + " 工资 = " + salMonth * salary);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
