package org.apache.basic;
import java.util.Arrays;
public class ArrayTest {
    public void  print(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        int [] nums = new int[]{25,7,126,53,14,86};
        System.out.println("输出nums中的元素"+Arrays.toString(nums));

        //输出私有方法内容
        ArrayTest arr = new ArrayTest();
        arr.print();
    }
}
