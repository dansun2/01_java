package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

/* 계산기 만들기
 * 두 수와 수식을 입력받아
 * 연산기호에 맞는 연산을 수행하는 프로그램을 만들어주세요.
 */

// 두 수를 스캔받는다
// 연산기호를 스캔받는다
// 계산한다. (if)

/*
* 1. Calculator 라는 메소드를 만든다. ->이게 무슨말이지?
* 2. 첫번째 수와 두번째 수를 입력받는다.
* 3. 연산기호를 입력받는다.
* 4. 연산기호를 확인한다.
* 5. 연산을 진행한다.
* 6. 반환한다.=출력한다.
* public double calculator(){}
* Scanner sc=new Scanner(System.in);
* int first=sc.nextInt();
* int second=sc.nextInt();
* char operator=sc.nextLine().charAt(0);
 */

public class Calculator {
    public static void main(String[] args) { //메인이라는 메소드가 클래스 안에 있는거
        Calculator calc = new Calculator(); // 메모리에 올려줘 주민번호로 =출생신고
        double cc = calc.calculator(); // calculator라는 메소드의 결과값을 double로 반환할거고 이름은 cc야
        
        System.out.println(cc); //cc를 출력해
    }
        public double calculator () {
            Scanner sc2 = new Scanner(System.in);

            double result = 0; // 이거 왜 이렇게 쓰더라?

            System.out.print("수 1을 입력해주세요 : ");
            double num2 = sc2.nextDouble();

            System.out.print("수 2를 입력해주세요 : ");
            double num3 = sc2.nextDouble();

            System.out.print("연산을 원하는 기호를 입력해주세요(+,-,*,/,%) : ");
            char rlgh = sc2.next().charAt(0);

            if (rlgh == '+') {
                result = num2 + num3;


            } else if (rlgh == '-') {
                result = num2 - num3;


            } else if (rlgh == '*') {
                result = num2 * num3;


            } else if (rlgh == '/') {
                result = num2 / num3;


            } else if (rlgh == '%') {
                result = num2 % num3;


            }

            // return ""+result; 혹은 return String.valueOf(result);
            return result;

        }

    // 한번에 연산식 입력받기


}
