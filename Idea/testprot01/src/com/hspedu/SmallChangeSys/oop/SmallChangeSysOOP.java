package com.SmallChangeSys.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "\n-------------------零钱通明细--------------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    String choice;

    public void mainMenu() {
//        System.out.println("显示零钱通菜单...");
        do {
            System.out.println("\n===== 零钱通菜单  ======");
            System.out.println("====  1 零钱通明细  ====");
            System.out.println("====  2 收益入账    ====");
            System.out.println("====  3 消费        ===");
            System.out.println("====  4 退出        ===");


            System.out.println("请选择(1-4)：");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
                    break;
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;//退出方法，不在执行后面的代码
        }

        balance += money;

        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.println("请输入消费金额：");
        money = scanner.nextDouble();
        //money 的值范围应该校验
        if (money <= 0 || money >= balance) {
            System.out.println("收益入账金额 应该在 0-" + balance);
            return;
        }

        System.out.println("请输入消费原因：");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到
        date = new Date();//获取当前的日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        while (true) {//要求用户必须输入y/n，否则就一直循环
            //1.阅读性好 2.拓展性好
            System.out.println("你确定要退出吗？y / n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                return;
            }
            if ("y".equals(choice)) {
                loop = false;
            }
        }
    }
}
