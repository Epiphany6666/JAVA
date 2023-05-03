package com.HomeWork.HomeWork04;

public class Manager extends Employee{
    private double bonus;

    /*public Manager(String name, double daySalary, int worksDay, double grade, double bonus) {
        super(name, daySalary, worksDay, grade);
        this.bonus = bonus;
    }*/
    //奖金是多少是不确定的
    public Manager(String name, double daySalary, int worksDay, double grade) {
        super(name, daySalary, worksDay, grade);
    }
    //用set给


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void PrintSalary() {
        //因为经理的计算方式和Employee不一样，所以我们可以重写
        System.out.println("经理 " + getName() + " 工资是= "
                + (bonus + getDaySalary() * getWorksDay() * getGrade()));
    }
}
