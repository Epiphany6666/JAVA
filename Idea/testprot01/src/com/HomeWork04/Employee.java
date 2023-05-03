package com.HomeWork.HomeWork04;

public class Employee {
    private String name;
    private double daySalary;
    private int worksDay;//workDays
    private double grade;

    public void PrintSalary() {
        System.out.print("普通员工 ");
        System.out.println(name + " 工资 = " + worksDay * daySalary * grade);
    }

    public Employee(String name, double daySalary, int worksDay, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.worksDay = worksDay;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorksDay() {
        return worksDay;
    }

    public void setWorksDay(int worksDay) {
        this.worksDay = worksDay;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
