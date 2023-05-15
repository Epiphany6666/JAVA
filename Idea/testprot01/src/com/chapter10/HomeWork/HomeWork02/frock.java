package com.chapter10.HomeWork.HomeWork02;

public class frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public frock(){
        this.serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
}
