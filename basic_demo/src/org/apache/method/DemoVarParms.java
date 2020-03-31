package org.apache.method;

public class DemoVarParms {
    //可变参数求和
    public void sum(int[]arr,int...n){
        int sum = 0;
        for (int i:arr){
            sum += i;
        }
        for(int i:n){
            sum += i;
        }
        System.out.println("总数为："+sum);
    }

    public static void main(String[] args) {
        DemoVarParms demoVarParms = new DemoVarParms();
        int[] arr = {1,2,};
        demoVarParms.sum(arr,3);
        demoVarParms.sum(arr,3,4);
        demoVarParms.sum(arr,3,4,5);
    }
}
