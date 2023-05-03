package com.HomeWork.HomeWork01;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("jack", 10, "画画");
        people[1] = new Person("milan", 21, "转螺丝");
        people[2] = new Person("小红", 3, "玩游戏");
        for(int i = 0; i < people.length - 1; i++) {
            Person temp ;
            for(int j = 0; j < people.length - 1 - i; j++) {
                if(people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < 3; i++) {
            System.out.println(people[i]);
        }
    }
}
