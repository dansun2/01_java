package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {

    /* A학생의 평균 점수를 구하는 프로그램을 만들어주세요.
    * 시험의 과목은 5개로 점수는 정수 단위 입니다.
    * 5개의 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
    * 예) A학생의 수학 :90점, 영어 80점, 국어 : 100점, 과학 : 70점이며 평균은 X입니다.
    *
    */

    // 1. 스캔을 뜬다.
    // 2. 점수 5개를 입력받는다. 수학, 영어, 국어, 과학, 사회
    // 3. 점수 5개를 배열에 저장한다.
    // 4. 평균값을 구한다.
    // 5. 출력한다


    public void score(){
        Scanner sc = new Scanner(System.in); // 스캔준비


        int[] a = new int[5]; //과목의 갯수. 5과목이라 인덱스는 5개
        int result = 0; // 밑에서 계속해서 더하기 때문에 =0을 안써주면 쓰레기값이 들어간다. 꼭 초기화시켜줘야함

        String[] subject = {"수학", "영어", "국어","과학","사회"}; // 과목 5개를 인덱스?에 0~4까지 순서대로 넣어주는건가 ***

        for (int i = 0; i < a.length; i++) { // 반복문 이용해서 5과목 스캔받기
            System.out.print(subject[i] + " 점수를 입력하세요 : "); // i가 0~4까지 5번 돌아가니까 subject 순서대로 과목프린트
            a[i] = sc.nextInt(); // 점수를 5번 입력받아서 a라는 정수에 넣음
            result += a[i]; // 점수를 계속해서 result에 누적해서 더한다
        }

        double avg = result / a.length; // a의 자리 길이가 5니까 평균값을 나눔. 실수로 해준다


        for(int i = 0; i < a.length; i++){ // 과목수가 5개니까 0번인덱스~4번인덱스까지 과목을 반복적으로 출력하기위한 for문
            System.out.print(subject[i] + " : " + a[i] + '\n' ); // 줄띄우기 할 때 문자열이 치환되는거라 ''를 꼭 써야함
        }
        System.out.println("평균점수 : " + avg);



    }




}
