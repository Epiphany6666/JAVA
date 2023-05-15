package com.chapter10.HomeWork.HomeWork05;

public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();

    }
}

class A{
    private String name;
    public void f1(){
        class B{
            private final String name = "1111";
            public void show(){
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
