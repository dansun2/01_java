package com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {
        int inum = 200;
        byte bnum = (byte) inum;
        System.out.println(bnum); // 오버플로우가 발생되어서 형변환을 할 때는 데이터 손실도 고려해야한다.
    }
}
