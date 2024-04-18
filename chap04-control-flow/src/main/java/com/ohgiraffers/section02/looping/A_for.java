package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {
        /*
         * for문 표현식
         * for(초기식; 조건식; 증감식){
         *   // 조건식이 참인 경우 실행할 구문 == 반복할 구문
         * }
         */
        for (int i = 0; i <= 10; i++) {
            System.out.println("만원 단위 : " + i);
            for (int x = 1; x <= 10; x++) {
                System.out.println("천원 단위 : " + x);
            }
        }


    }

    public void gugudan(){
        for(int i = 1; i<=9; i++) {

            for(int x = 1; x<=9; x++) {
                int bae = i % x;
                if( bae == 0) {
                    System.out.println(i + " X " + x + " = " + (i * x));
                }
            }
        }
    }

    public void student(){
        Scanner sc = new Scanner(System.in);


        for(int i = 1; i<=10; i++){
            System.out.print("이름을 입력하세요 : ");
            String str1 = sc.nextLine();
            System.out.print("나이를 입력하세요 : ");
            String str = sc.nextLine();

            System.out.print("이름 : " + str1 + "   ");
            System.out.println("나이 : " + str);
        }
    }
}
