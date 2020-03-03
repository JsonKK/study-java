package org.apache.basic;

public class callEntry {
    public static void main(String[] args) {
        //引入其他类
        Telphone telphone = new Telphone();
        //调用telphone的方法
        //发现screen\cpu\ram等基础信息被赋予了初始值0.0
        telphone.phoneInfo();
        //为变量赋值
        telphone.screen = 5.5f;
        telphone.cpu = 2.0f;
        telphone.ram = 2000f;
        telphone.phoneInfo();
    }
}
