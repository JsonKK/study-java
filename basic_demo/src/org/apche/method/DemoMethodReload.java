package org.apche.method;

public class DemoMethodReload {

    //求两个int的累加和
    public int plus(int n,int m){
        return  n + m;
    }

    //求双精度两个数的和
    public double plus(double n,double m){
        String nStr = n+"";
        String mStr = n+"";
        //小数点后有几位
        int nInt=0,mInt=0,maxInt = 1;
        if(nStr.contains(".")){
            nInt = nStr.length() - 2;
        }
        if(mStr.contains(".")){
            mInt = mStr.length() - 2;
        }
        if(nInt>maxInt){
            maxInt = (int)Math.pow(10,nInt);
        }
        else{
            maxInt = (int)Math.pow(10,mInt);
        }
        //双精度在计算的时候，计算精度会失真
        return  (m*maxInt + n*maxInt)/maxInt;
    }

    //整型数组求和
    public int plus(int[] arr){
        int sum = 0;
        for(int item:arr){
            sum += item;
        }
        return  sum;
    }

    public static void main(String[] args) {
        DemoMethodReload demoMethodReload = new DemoMethodReload();
        int m = 10,n=20;
        System.out.println(m+"与"+n+"的和是："+demoMethodReload.plus(m,n));
        double a = 5.6,b=7.8;
        System.out.println((a+"").length());
        System.out.println(a+"与"+b+"的和是："+demoMethodReload.plus(a,b));
        int[] arr = {10,20,30,40,50,60};
        System.out.println("数组的累加和是："+demoMethodReload.plus(arr));
    }
}
