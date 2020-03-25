package org.apche.method;
import org.apache.basic.DemoGuess;

import java.util.Scanner;
import java.util.Arrays;

public class DemoGuessMethod {
    //判断数组内是否有这个值
    public Boolean guess(int n,int[] arr){
        Boolean fla = false;
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == n){
                fla = true;
                break;
            }
        }
        return  fla;
    }

    //随机抽取7个数字，不重复，控制台输入数字判断是否猜中
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[7];
        int[] arr2 = {21,21};
        int n;
        for (int i = 0;i<arr.length;i++){
            do{
                n = (int)(Math.random()*32 + 1);
            }while(Arrays.asList(arr).contains(n));
            arr[i] = n;
            //System.out.println(i+"项"+arr[i]);

        }
        System.out.println("请输入你猜的数字");
        DemoGuessMethod demoGuessMethod = new DemoGuessMethod();

        int guessNum = -1;
        int count = 0;
        do{
            count++;
            Scanner sc = new Scanner(System.in);
            guessNum = sc.nextInt();
            System.out.println("加油,马上就猜中了");
        }while (!demoGuessMethod.guess(guessNum,arr));

        System.out.println("恭喜你，猜中了");
        System.out.print("猜了"+count+"次");
    }
}
