package main.java.com.ohgiraffers.section03.math;

public class Application01 {
    public static void main(String[] args) {
        /*
        * api란?
        * Application programing interface는 응용프로그램에서 사용할 수 있도록
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해서 우리가 구현할 수 없거나 구현하기 번거로운 기능들을
        * jdk를 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다.
        * 더 쉽게 누군가 작성해놓은 소스코드를 가져다 사용하는 것이다.
         */

        System.out.println(java.lang.Math.abs(-7.0)); //오버로딩이라는거 찾아보기 //abs는 메소드(가로를 열고 닫았네)
        // 같은 패키지안에는 같은 클래스가 존재할 수 없고 다른패키지의 같은 클래스는 .<-이런식으로 위치를 표시해줘야함
    }
}
