package com.SmallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
//        1.先完成显示菜单，并可以选择菜单，给出对应提示
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2.完成零钱通明细
        //（1）可以把收入和消费，保存到数组 （2）可以使用对象  （3）简单的话可以使用String拼接
        //选（3）
        String details = "\n-------------------零钱通明细--------------------";


        //3.完成收益入账
        //定义新的变量
        double money = 0;
        double balance = 0;
        Date date = null;//data 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化的

        //4.完成消费
        //定义新变量，保存消费的原因
        String note = "";

        //5.退出

        //6.用户输入退出时，给出提示“你确定要退出吗？y/n”
        String choice;

        //7.在收益入账和消费时，判断金额是否合理，并给出相应的提示
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
                    //System.out.println("1 零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
//                    System.out.println("2 收益入账");
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    //money 的值范围应该校验
                    //思路：找出不正确金额的条件，给出提示即可，就直接break;
                    if(money <= 0) {
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }

                    balance += money;

                    date = new Date();//获取当前的日期
                    //拼接收益入账信息到details
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
//                    System.out.println("3 消费");
                    System.out.println("请输入消费金额：");
                    money = scanner.nextDouble();
                    //money 的值范围应该校验
                    if(money <= 0 || money >= balance) {
                        System.out.println("收益入账金额 应该在 0-" + balance);
                        break;
                    }

                    System.out.println("请输入消费原因：");
                    note = scanner.next();
                    balance -= money;
                    //拼接消费信息到
                    date = new Date();//获取当前的日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    /*boolean flag = true;
                    while (flag) {
                        System.out.println("你确定要退出吗？y / n");
                        choice = scanner.next().charAt(0);
                        if (choice == 'y') {
                            loop = false;
                        } else if (input == 'n') {
                            flag = false;
                        } else {
                            System.out.println("输入有误，请重新输入y/n");
                        }
                    }*/

                    //或者使用while + break；
                    /*while (true) {
                        System.out.println("你确定要退出吗？y / n");
                        choice = scanner.next().charAt(0);
                        if (choice == 'y') {
                            loop = false;
                        } else if (choice == 'n') {
                            break;
                        } else {
                            System.out.println("输入有误，请重新输入y/n");
                        }
                    }*/

                    //一段代码尽量完成一个小功能，尽量不要混合在一起，建议使用这种方法
                    while (true) {//要求用户必须输入y/n，否则就一直循环
                        //1.阅读性好 2.拓展性好
                        System.out.println("你确定要退出吗？y / n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
                    break;
            }
        }while (loop) ;
        System.out.println("-------退出了零钱通----------");
    }
}