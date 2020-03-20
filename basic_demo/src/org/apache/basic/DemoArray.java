package org.apache.basic;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

public class DemoArray {
    public static void main(String[] args) {
//        定义数组
        int[] intArr;
        String[] stringArr = new String[10];
        float[] floatArr = new float[10];
        intArr = new int[100];
        for(int i=0;i<intArr.length;i++){
            //对数组每项赋值
            //intArr[i] = i + 1;
            intArr[i] = (int)(Math.random()*100);
            //输出数组每项的值
            if(i==0){
                System.out.print("数组的值是:");
            }
            System.out.print(intArr[i]+" ");
        }
        //int[] norepeatArr = clear(intArr);
        //Integer[] norepeatArr = clearTwo(intArr);
        int[] norepeatArr = clearThree(intArr);
        //输出数组的最大值
        System.out.println();
        System.out.println("去重后数组的长度是:"+norepeatArr.length);
        int max = 0;

        for (int i=0;i<norepeatArr.length;i++){
            //与最大值比较判断
            if(intArr[i]>max){
                max = intArr[i];
            }
        }
        System.out.println("整型数组最大值为："+max);
    }

    //去重数组
//    public static int[] clear(int[] arr){
//        Set<Integer> s = new TreeSet<Integer>();
//        for(int i = 0;i<arr.length;i++){
//            s.add(arr[i]);
//        }
//        return  s.toArray();
//    }
    //使用Integer类型实现数组去重
    public static Integer[] clearTwo(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        return  list.toArray(new Integer[]{});
    }
    //使用int类型实现数组去重
    public static int[] clearThree(int[] arr){
        //创建数组队列
        //与Java中的数组相比，它的容量能动态增长
        //因为不确定去重后
        List list = new ArrayList();
        //循环传进来的数组，判断list种是否包含了当前项
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        //定义整型数组,并把List数组长度赋值给数组
        int[] arrs = new int[list.size()];
        for (int i=0;i<arrs.length;i++) {
            arrs[i] = (int)list.get(i);
        }
        //int[] arrs = list.stream().mapToInt(String::valueOf).toArray();
        return arrs;
    }
}
