package org.apache.method;

public class DemoFibonacci {
    //斐波那契数方法
    public long fibonacci(int n){
        long value;
        if(n == 1 || n == 2){
            value = 1;
        }
        else {
            value = fibonacci(n-1) + fibonacci(n-2);
        }
        return value;
    }

    public static void main(String[] args) {
        DemoFibonacci demoFibonacci = new DemoFibonacci();
        int n = 50;
        long time = System.currentTimeMillis();
        long newN = demoFibonacci.fibonacci(n);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - time + "a");
        System.out.println(newN);
    }
}
