package org.apache.basic;

public class DemoBubblingSort {
    public static void main(String[] args) {
        //实现整型数组从小到大冒泡排序
        int [] arr = new int[25];
        int temp;
        System.out.print("排序前的数组是：");
        for(int i = 0;i<arr.length;i++){
            //问题，如何输出1~100的随机数
            //1~100是不包括100的，但包括1
            arr[i] = (int) (Math.random()*(100-1)+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int [] arr2 = arr;
        //从小到大排序
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("排序后的数组是：");
        for(int a :arr){
            System.out.print(a + " ");
        }
        System.out.println();
        //从大到小排序
        for(int i = 0;i<arr2.length;i++){
            for (int j = 0;j<arr2.length-i-1;j++){
                if(arr2[j] < arr2[j+1]){
                    temp = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.print("排序后的数组是：");
        for(int a :arr2){
            System.out.print(a + " ");
        }
    }
}
