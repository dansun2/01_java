package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf; //여기 있는 maxNumberOf라는 함수를 불러옴
 //동일 패키지에 있는 파일은 import로 추가할필요X

public class Application01 {
    public static void main(String[] args){
        int first = 200;
        int second = 300;
        main.java.com.ohgiraffers.section01.method.Calculator cal = new main.java.com.ohgiraffers.section01.method.Calculator();
        //Calculator cal = new Calculator();
        //여기서 꼭 경로를 지정해줘야 하는 이유가?
        int max = maxNumberOf(first, second);
        System.out.println(max);


        int min = cal.minNumberOf(first, second);
        System.out.println(min);

        /*
        import main.java.com.ohgiraffers.section01.method.Calculator;
        int max = main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf(first, second);
        System.out.println(max);
         */
    }
}
