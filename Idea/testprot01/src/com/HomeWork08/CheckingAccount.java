package com.HomeWork.HomeWork08;

public class CheckingAccount {
    /*public void deposit(double amount) {
        System.out.println("存款收取1美元手续费");
        amount -= 1;
    }
*/

    //或者
    super.deposit(double amount) {
        super.deposit(amount - 1);
    }
    public void withdraw (double amount) {
        System.out.println("取款收取1美元手续费");
        amount += 1;
    }
}
