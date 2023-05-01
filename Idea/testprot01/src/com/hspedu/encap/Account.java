package com.hspedu.encap;

public class Account {
    private String name;
    private double surplus;//balance
    private String passWord;

    public Account() {
    }

    public Account(String name, double surplus, String passWord) {
        this.setName(name);
        this.setSurplus(surplus);
        this.setPassWord(passWord);

        setName(name);
        setSurplus(surplus);
        setPassWord(passWord);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字长度必须大于等于2小于等于4");
            this.name = "无名";
        }
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        if(surplus >= 20) {
            this.surplus = surplus;
        } else {
            System.out.println("输入的余额必须大于20，给你默认值20");
            this.surplus = 20;
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if (passWord.length() == 6) {
            this.passWord = passWord;
        } else {
            System.out.println("密码必须等于6，给你一个默认密码\"123456\"");
            passWord = "123456";
        }
    }

    public String info() {
        return "name = " + name + "  surplus = " + surplus + "  passWord = " + passWord;
    }
}
