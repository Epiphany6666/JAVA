package com.chapter13.newHomeWork;

public class test {
    public static void main(String[] args) {
        String s = "abcdef";
        int length = s.length();
        String str = null;
        try {
            str = reverse(s, 1, length - 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(s);
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        //1.写出正确的情况
        //2.然后取反即可
//        if (str != null && start >= 0 && end > start && end < str.length() - 1) {
        if (!(str != null && start >= 0 && end > start && end < str.length() - 1)) {
//            return str;
            throw new RuntimeException("参数不正确");//如果想要打出哪个参数不正确，分开写即可
        }

        char[] arr = str.toCharArray();
//        char temp = ' ';//交换辅助变量
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        /*//或者：
        for (int i = start, j = end; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/
        str = new String(arr);
        return str;
//        return new String(arr);
    }
}
