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
            int lang = 15;
            //定义空格数
            int space = lang - 1;
            for(int i = 0;i<lang;i++){
                //每行输出得空格数
                for (int n=0;n<space;n++){
                    System.out.print(" ");
                }
//                每行输出的*个数
                for(int j =2*i-1;j>0;j--){
                    System.out.print("*");
                }
                space--;
                System.out.println();
            }
        }
    }
}
