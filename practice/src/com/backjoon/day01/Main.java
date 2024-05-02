package com.backjoon.day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for (int n = 1; n <= length; n++){
            System.out.print(" ");
            for(int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.print('\n');

        }
    }
}