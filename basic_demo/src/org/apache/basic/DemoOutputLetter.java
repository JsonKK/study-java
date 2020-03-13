package org.apache.basic;

public class DemoOutputLetter {
    public static void main(String[] args) {
        //思路：用整型转换为ascii码输出字母（65-90）
        //定义起始值
        int n = 65;
        int sum = 1;
        while (n>64 && n<91){
            if(sum >= 13 && sum % 13 == 0){
                System.out.println((char)n + " ");
            }
            else{
                System.out.print((char)n + " ");
            }
            sum++;
            n++;
        }
    }
}
