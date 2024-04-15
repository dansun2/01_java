package com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args) { //메인메소드
        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.
        */

        int inum = 10;
        long lnum = 100;

        int isum = inum + (int)lnum; //
        // int isum = (int)(inum + lnum); 과 문법적으로는 비슷하지만 연산결과는 달라질 수 있음

        byte byteNum1 = 1; // ?왜 inum은 iNum이 아닌지
        byte byteNum2 = 2;
        short shortNum1 = 1;
        short shortNum2 = 2;

        int result = byteNum1 + byteNum2;
        // byte = (byte)((int)byte+(int)byte))
        int result2 = shortNum1 + shortNum2;


    }
}
