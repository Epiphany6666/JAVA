package com.HomeWork.HomeWork13;

public class HomeWork13 {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("xs1", "女", 12, "110");
        people[1] = new Student("xs2", "女", 9, "15");
        people[2] = new Teacher("tc1", "女", 22, 10);
        people[3] = new Teacher("tc2", "女", 20, 20);
        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.sort(people);
        for (int i = 0; i < people.length; i++) {
            if(people[i] instanceof Student) {
                ((Student)people[i]).study();
            } else if (people[i] instanceof Teacher) {
                ((Teacher)people[i]).teach();
            } else {
                System.out.println("类型有误，请重新输入");
            }
            System.out.println(people[i].info());
            System.out.println(people[i].play());
            if (i < people.length - 1)
            System.out.println("-----------------------");
        }

        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i]);//此时会跟运行内存相绑定，会自动调用toString
            //但是toSting方法需要重写
        }


    }
    //如果要用方法打印向下转型：
    public void test(Person p){
        if(p instanceof Student) {
            ((Student)p).study();
        }

    }

    public void sort(Person[] people) {//这里数组不能有长度
        int len = people.length;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
//                Person temp;
                Person temp = null;
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
}
