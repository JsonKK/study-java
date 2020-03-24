package org.apache.basic;
import java.util.Scanner;
public class DemoArrayTwoLevel {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩");
        Scanner sc = new Scanner(System.in);
        int stuNum = 3;
        int subjectNum = 2;
        int [][] stuArr = new int[stuNum][subjectNum];
        //求平均成绩
        int totalChinese=0,totalMath=0;
        float avgChinese,avgMath;
        for (int i = 0;i<stuNum;i++){
            for(int j = 0;j<subjectNum;j++){
                String subject;
                if(j==0){
                    subject = "语文";
                }
                else{
                    subject = "数学";
                }
                System.out.println("请输入第"+(i+1)+"名学生的" + subject + "成绩");
                stuArr[i][j] = sc.nextInt();
                if(j == 0){
                    totalChinese += stuArr[i][j];
                }
                else{
                    totalMath += stuArr[i][j];
                }
            }
        }

        System.out.println("语文总分是:"+totalChinese);
        System.out.println("数学总分是:"+totalMath);
        System.out.println("语文平均分是:"+(float)(totalChinese/stuArr.length));
        System.out.println("数学的平均分是:"+(float)(totalMath/stuArr.length));
    }
}
