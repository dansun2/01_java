package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    public int minNumberOf(int first, int second){ //메소드의 이름값을 지어줄때는 이렇게 의미를 넣어줘야함
        //1<2? 1:2;
        return(first<second)? first:second;
    }

    public static int maxNumberOf(int first, int second){ // static은 프로그램이 실행될때 메모리에 먼저 올린다
        return(first<second)? second:first;
    }

}
