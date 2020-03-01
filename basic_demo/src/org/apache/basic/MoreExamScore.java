package org.apache.basic;
import java.util.Scanner;
/*
需求:获取并计算多个班级的多个学生的平均分
1.定义班级数量
2.定义学生数量
3.定义单位班级内学生成绩总和的变量
4.定义单位班级的学生成绩平均分变量
*/

public class MoreExamScore {
    public static void main(String[] args) {
        int classNum = 3;
        int studentNum = 4;
        double sum;
        double avgScore;
        for(int i = 1;i<=classNum;i++){
            sum = 0;
            System.out.println("****请输入"+ i + "班同学的成绩***");
            for(int j = 1;j<=studentNum;j++){
                System.out.print("请输入第"+j+"名学生的成绩");
                Scanner input = new Scanner(System.in);
                sum += input.nextInt();
            }
            avgScore = sum/studentNum;
            System.out.println(i+"班同学的平均分是："+avgScore);
        }
    }
}
