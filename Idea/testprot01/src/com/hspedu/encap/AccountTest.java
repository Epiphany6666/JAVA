package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("jack",20,"123456");
        //或者
        Account account1 = new Account();
        account1.setName("jac");
        account1.setPassWord("11111");
        account1.setSurplus(10);
        System.out.println(account.info());
    }
}
