package com.HomeWork.homework05;


public class teacher extends Employee{
    private double classSal;
    private int days;//classDay

    //这里可以不用给构造器，因为上课次数和课时费是不固定的，但其他属性还是要构造器的
    public teacher(String name, double salary) {
        super(name, salary);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void PrintSal() {
        System.out.println("教师 " + getName() + " 工资 = " + (classSal * days + getSal() * getSalary()));
    }
}
