package com.HomeWork.HomeWork03;

public class HomeWork03 {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public void introduce() {
        System.out.println("姓名 " + name + " 年龄 "
                + age + "职称" + post + "工资" + salary);
    }

    //看老师
    public HomeWork03(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
