package com.HomeWork.HomeWork13;

public class Student extends Person{
    private String stu_id;

    public void study() {
        System.out.println("我承诺，我会搞好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String info() {
        return super.info() + "学号：" + stu_id;
    }

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
