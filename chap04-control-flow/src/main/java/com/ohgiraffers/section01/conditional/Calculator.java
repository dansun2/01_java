package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

/* 계산기 만들기
 * 두 수와 수식을 입력받아
 * 연산기호에 맞는 연산을 수행하는 프로그램을 만들어주세요.
 */

// 두 수를 스캔받는다
// 연산기호를 스캔받는다
// 계산한다. (if)

public class Calculator {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        double result;

        System.out.print("수 1을 입력해주세요 : ");
        double num2 = sc2.nextDouble();

        System.out.print("수 2를 입력해주세요 : ");
        double num3 = sc3.nextDouble();

        System.out.print("연산을 원하는 기호를 입력해주세요(+,-,*,/,%) : " );
        char rlgh = sc4.next().charAt(0);

        if(rlgh == '+'){
            result = num2 + num3;
            System.out.println(result);
        }else if(rlgh == '-'){
            result = num2 - num3;
            System.out.println(result);
        }else if(rlgh == '*'){
            result = num2 * num3;
            System.out.println(result);
        }else if(rlgh == '/'){
            result = num2 / num3;
            System.out.println(result);
        }else{
            result = num2 % num3;
            System.out.println(result);
        }
    }
}
