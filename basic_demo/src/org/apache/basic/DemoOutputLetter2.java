package org.apache.basic;

public class DemoOutputLetter2 {
    public static void main(String[] args) {
        //使用字符，输出26个字母
        //学习点，字符集是可以被自动转为ascii码进行计算的
        char ch = 'a';
        int count = 1;
        while (ch <= 'z'){
            System.out.print(ch + " ");
            if(count % 13 == 0){
                System.out.println("");
            }
            count++;
            ch++;
        }
    }
}
