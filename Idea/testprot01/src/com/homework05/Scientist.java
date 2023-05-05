package com.HomeWork.homework05;

public class Scientist extends Employee{
    private double YearBonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getYearBonus() {
        return YearBonus;
    }

    public void setYearBonus(double yearBonus) {
        YearBonus = yearBonus;
    }

    @Override
    public void PrintSal() {
        System.out.println("科学家 " + getName() + " 工资 = " + (YearBonus + getSalary()));
    }
}
