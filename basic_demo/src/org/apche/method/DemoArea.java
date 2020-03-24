package org.apche.method;
import java.lang.reflect.Array;
import  java.util.Scanner;

public class DemoArea {
    //计算长方形面积
    public int[] area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入矩形的宽度");
        int width = sc.nextInt();
        System.out.println("请输入矩形的高度");
        int height = sc.nextInt();
        int[] arr = new int[2];
        arr[0] = width*height;
        arr[1] = (width+height)*2;
        return arr;
    }

    public static void main(String[] args) {
        DemoArea demoArea = new DemoArea();
        int[] arr = demoArea.area();
        System.out.println("矩形的面积是："+ arr[0]);
        System.out.println("矩形的周长是："+ arr[1]);
    }
}
