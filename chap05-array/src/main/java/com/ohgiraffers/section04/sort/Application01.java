package com.ohgiraffers.section04.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application01 {
    public static void main(String[] args) {
        int[] num = {20,10};

        int temp = num[0]; //20
        num[0] = num[1]; // 10
        num[1] = temp;

        int[] arr = {2,1,3};
        for (int x : arr){
            System.out.println(x + " ");

        }
        System.out.println("정렬후");
        Arrays.sort(arr);
        for (int x : arr){
            System.out.println(x + " ");
        }

    }
}
