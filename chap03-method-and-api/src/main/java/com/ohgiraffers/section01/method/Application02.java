package main.java.com.ohgiraffers.section01.method;

public class Application02 { //함수의 규칙 : 접근제어자 반환타입
    public static void main(String[] args) {
        /*
        * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         */

        /*
        * 변수의 종류
        * 1. 지역변수 -> 그래서 main 안에 들어간 변수는 testMethod 쪽에선 사용X
        * 2. 매개변수 -> 전달인자
        * 3. 전역변수(필드) -> 클래스가 갖는 일반적인 속성
        * 4. 클래스(static) 변수 -> 프로그램이 실행됨과 동시에 메모리에 올려서 항상 실행될 수 있게 함
         */

        /*
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        * ******다만 지역변수가 선언된 이후부터 사용가능함
        *
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때 전달하는 값을 전달인자(argument)라고 부르고
        * 메소드 선언부 괄호안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         */

        int age = 20;
        Application02 app1 = new Application02();
        Application02 app2 = new Application02();
        int x=78;
        int y=15;

        app1.testMethod(age); // 클래스가 갖는 속성을 정의


    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age+"세 입니다."); //이것도 매개변수
    }


    // 내가 해야 되는 일의 목록을 정리먼저 해야한다.
    //add함수-정수2개-더ㅐ해=


}
