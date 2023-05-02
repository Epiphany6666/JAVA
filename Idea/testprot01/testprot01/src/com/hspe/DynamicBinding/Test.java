package com.hspe.DynamicBinding;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2000);
        Manager milan = new Manager("milan", 5000, 20000);
        Test test = new Test();
        test.showEmpAnnal(tom);
        test.testWork(tom);
        test.showEmpAnnal(milan);
        test.testWork(milan);
    }
    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker)e).work();

        } else if (e instanceof Manager) {
            ((Manager)e).manager();
        }
    }
}
