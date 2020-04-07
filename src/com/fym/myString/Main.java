package com.fym.myString;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 5};
        List<String> ints = Arrays.asList("1","2","3");
        System.out.println(ints);
        int[] arr1= Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr1));
        //System.out.println(getMax(arr));
        //sort(arr);
       // selectSort(arr);
    //  System.out.println(Arrays.toString(arr));
        //int i = binarySearch(arr,4);
      //  System.out.println(i);
    }

    //手写找出做大值
    static int getMax(int[] arr) {
        if (arr != null && arr.length > 0) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }
        return -1;
    }

    //冒泡排序法
    static void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    static void selectSort(int[] arr) {
        int temp = 0;
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
    //二分法查找
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        if (arr != null && arr.length > 0) {
            while (low <= high) {
                int mid = (low + high) >> 1;
                int midVal = arr[mid];
                if (midVal < key) {
                    low = mid + 1;
                } else if (midVal > key) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
