package org.apache.basic;

public class DemoDoubleLoop {
    public static void main(String[] args) {
       /* 1.计算1~30的阶乘*/
        {
            //总数
            long sum = 0;
            //循环次数
            int loop = 32;
            int m = 1;
            while (m <= loop){
                int n = 1,product = 1;
                while (n<=m){
                    product *= n;
                    n++;
                }
                m++;
                sum += product;
            }
            System.out.println("1~"+loop+"的阶乘是:"+sum);
        }

        //利用for循环输出正三角形
        {
            //定义行数
            int lang = 5;
            for(int i = 0;i<lang;i++){

            }
        }
    }
}
