package org.apache.basic;

public class DemoFor {
    public static void main(String[] args) {
        //需求，编写一个程序，求出200到300之间，且满足条件：他们三个数之积为42，三个数之和为12.
        for(int i = 200;i<300;i++){
            //比较麻烦的求百、十、个位数
            //int hundred = (i-(i%100))/100;
            //int decade = ((i - hundred*100) - (i - hundred*100)%10)/10;
            //int single = i - hundred*100 - decade*10;

            int hundred = i/100;
            int decade = i/10%10;
            int single = i%10;
            if(hundred*decade*single == 42 & hundred+decade+single == 12){
                System.out.println(i);
            }
        }
    }
}
