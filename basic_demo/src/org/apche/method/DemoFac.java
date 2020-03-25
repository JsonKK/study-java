package org.apche.method;

//阶乘方法
public class DemoFac {
//    求阶乘和
    public int fac(int n){
        int sum = 0;
        int basicNum = 0;
        for (int i=1;i<=n;i++){
            basicNum = 1;
            for (int j = 1;j<=i;j++){
                basicNum *= j;
            }
            sum += basicNum;
        }
        return  sum;
    }

    public static void main(String[] args) {
        DemoFac demoFac = new DemoFac();
        //需要求阶层和的数
        int n = 3;
        System.out.println(n+"的阶乘和是"+demoFac.fac(n));
    }
}
