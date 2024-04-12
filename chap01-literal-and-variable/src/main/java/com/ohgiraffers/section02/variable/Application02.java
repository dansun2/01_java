package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args){
        /*
        *자료형이란
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다.
        * 예) 앞으로 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        * 이러한 자료형은 기본자료형(primitive type)과 참조자료형(Referance type)으로 나뉘어진다.
        * 그 중 기본자료형 8가지부터 살펴본다.
         */

        // 정수를 취급하는 자료형은 4가지가 있다.
        byte bnum;      //1byte 128까지?
        short snum;     //2byte
        int inum;       //4byte
        long lnum;      //8byte

        // 실수를 취급하는 자료형은 2가지이다.
        float fnum;     //4byte
        double dnum;    //8byte

        // 문자를 취급하는 자료형은 한 가지가 있다.
        char ch;        //2byte

        // 논리형을 취급하는 자료형은 한 가지가 있다.
        boolean isTrue; //1byte

        // 문자열을 취급하는 자료형(문자열은 레퍼런스타입.기본자료형이아님)
        String str;     //4byte

        // 변수 초기화하기
        bnum = 1; // =는 대인연산자
        snum = 2;
        inum = 3;
        lnum = 4L;

        System.out.println(bnum);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lnum);

        // 실수에 값을 초기화 하기
        fnum = 0.3f;
        dnum = 0.4;

        // 논리를 취급하는 자료형
        isTrue = true;
        isTrue = false;

        // 문자를 취급하는 자료형 아스키코드 참고! 자바는 대문자와 소문자 구별
        ch = 'A';
        ch = 97;


        //문자열을 취급하는 자료형
        str = "안녕하세요.";


    }
}
