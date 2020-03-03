package org.apache.basic;

public class Telphone {
    float screen;
    float cpu;
    float ram;
    //把方法定义为私有的
    private void phone(){
        System.out.println("有打电话的功能");
    }
    private void sendMessage(){
        System.out.println("有发短信的功能");
    }
    void phoneInfo(){
        System.out.println("screen:"+screen);
        System.out.println("cpu:"+cpu);
        System.out.println("ram:"+ram);
        sendMessage();
        phone();
    }
}
