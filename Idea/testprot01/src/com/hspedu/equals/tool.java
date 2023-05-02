package com.equals;

public class tool {
    public static void main(String[] args) {
        Person person = new Person("jack", 10, "男");
        Person person1 = new Person("jack", 10, "男");
        System.out.println(person.equals(person1));
    }
}

