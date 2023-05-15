package com.chapter10.HomeWork.HomeWork04;

public class HomeWork04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer() {
            @Override
            public int work(int a, int b) {
                return a +b;
            }
        }, 4, 5);
    }
}
