package com.HomeWork.homework05;


public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new waiter("nan1",1000);
        employees[0].PrintSal();

        employees[0].setSalary(12);//可以灵活修改带薪月份

        employees[1] = new Worker("nan2",2000);
        employees[0].PrintSal();

        employees[2] = new teacher("nan3",5000);
        ((teacher)employees[2]).setClassSal(2000);
        ((teacher)employees[2]).PrintSal();

        employees[3] = new Scientist("nan4",6000);
        ((Scientist)employees[3]).setYearBonus(10000);
        ((Scientist)employees[3]).PrintSal();
    }
}
