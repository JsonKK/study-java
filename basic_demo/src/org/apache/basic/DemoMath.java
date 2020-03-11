package org.apache.basic;

public class DemoMath {
    public static void main(String[] args) {
        int num1 = 10,num2 = 5;
        float result;
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        float num3 = 13.5f;
        result = num3 % num2;
        System.out.println(num3 + "/" + num2 + "=" + result);
    }
}
