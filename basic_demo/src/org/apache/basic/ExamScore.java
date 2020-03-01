package org.apache.basic;
import java.util.Scanner;

/*
对不及格分数进行累加
1.输出当前成绩
2.判断当前成绩是否满足及格线
3.对不满足分数的成绩进行加分处理，并记录下加分的次数
加入用户自定义输入功能
1.引入scanner工具类（在java.util工具类下）
2.实例化Sanner方法
3.获取输入的值，并转为想要的数据格式
*/
public class ExamScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的分数");
        int score = input.nextInt();
        int count = 0;
        System.out.println("加分前的成绩是："+score);
        while(score<60){
            score++;
            count++;
        }
        System.out.println("加分后的成绩："+score);
        System.out.println("加分的次数："+count);
    }
}
