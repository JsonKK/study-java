package org.apache.method;

public class DemoSimpleMethod {
    //打印函数
    public static void print(String content){
        int lang = content.length();
        String start = "";
        for (int i = 0;i<lang*2;i++){
            start += "*";
            //System.out.print("*");
        }
        System.out.print(start);
        System.out.println();
        System.out.println(content);
        System.out.print(start);
    }

    public static void main(String[] args) {
        DemoSimpleMethod simpleMethod = new DemoSimpleMethod();
        simpleMethod.print("java 是一个神奇的语言");
    }
}
