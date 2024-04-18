package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// 계산기를 만들고 결과를 반환(switch이용) 변환된 결과는 Application02에서 출력
// +,-,*,/ 만 제공하고 일치하지 않는 경우 연산불가라는 결과를 출력. 반환값 0 .0
public class Dswitch {

    public double switchCalculator(){

        // 1. 값을 입력받음
        Scanner sc= new Scanner(System.in);
        // 2. 첫 수 입력받기
        int first = sc.nextInt();
        // 3. 두 번째 수 입력
        int second = sc.nextInt();
        // 4. 연산기호 입력
        char op = sc.next().charAt(0);
        double result = 0.0;
        // 5. 연산기호 비교
        switch(op){
            case '+' : result = first + second; break;
            case '-' : result = first - second; break;
            case '*' : result = first * second; break;
            case '/' : result = first / second; break;
            default:
            System.out.println("연산불가");
            break;

        }
        // 6. 반환
        return result;
    }
// 등급 계산기 프로그램
// main에서 학생의 성적을 입력받고 아래의 메소드에서 학생의 등급을 화면에 출력해주세요.
// 100 = a+
// 100~90초과 = a
// 85~90 = b+
// 75~85 = b
// 60~75 = c
// 60 미만 D
// F는 없다.


    //1. 메소드를 만든다.

//3. 출력한다.
    public void gradeCal(int score){
        String grade;
    //2. 점수의 범위를 구분한다.
        if(score == 100) {
            grade = "A+";
        }else if (score >=90 && score < 100){
            grade = "A";
        }else if (score >=85 && score < 90){
            grade = "B+";
        }else if (score >=75 && score < 85){
            grade = "B";
        }else if (score >= 60 && score <75){
            grade = "C";
        }else {
            grade = "D";
        }
        System.out.println(grade + "등급");
    }
}


