package org.apche.method;

public class DemoMethodReloadTwo {
    //固定参数方法
    public void sum(int a,int b){
        int s = (a+b);
        System.out.println("不带可变参数的值"+ s);
    }

    //不可变参数
    public void sum(int ...a){
        int s = 1;
        for (int n:a){
            s *= n;
        }
        System.out.println("带可变参数的值"+ s);
    }
    public static void main(String[] args) {
        DemoMethodReloadTwo demoMethodReloadTwo = new DemoMethodReloadTwo();
        demoMethodReloadTwo.sum(2,3);
    }
}
