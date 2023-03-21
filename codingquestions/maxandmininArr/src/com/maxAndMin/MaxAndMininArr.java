package com.maxAndMin;

public class MaxAndMininArr {
    public static void MaxAndMinEle(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element in array is : " + max);
        System.out.println("The minimum Element in array is : " + min);
    }
}
