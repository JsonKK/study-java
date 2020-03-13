package org.apache.basic;

public class DemoFlowJudge {
    public static void main(String[] args) {
        int a = 5,b=4,c=3,d=2;
        if(a>b && b>c){
            System.out.println(d);
        }

        //switch语句
        char ch = '8';
        int r = 10;
        System.out.println(ch+1);
        //在判断条件内字符型自动被转换为了数值型进行计算
        switch (ch+1){
            case  '7':r = r+3;
            case  '8':r = r+5;
            case  '9':r = r+6;
                break;
            default:
                r = r+8;
                break;
        }
        System.out.println(r);
    }
}
