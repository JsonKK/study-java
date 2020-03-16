package org.apache.basic;
import  java.util.Scanner;
public class DemoGuess {
    public static void main(String[] args) {
        //定义一个1-10的随机数
        int number = (int) (Math.random()*10 + 1);
        //定义猜测的数字
        int guess,count=0;
        System.out.println("请输入1-10间的整数");
        do{
            count++;
            System.out.println("请输入你猜的数字");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if(guess>number){
                System.out.println("太大");
            }
            else if(guess < number){
                System.out.println("太小");
            }
        }while (number != guess);
        System.out.println("猜对了！,共猜了" + count + "次");
    }
}
