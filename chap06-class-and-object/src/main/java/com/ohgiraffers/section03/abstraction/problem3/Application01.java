package com.ohgiraffers.section03.abstraction.problem3;

public class Application01 {

    public static void main(String[] args){
        Car ram = new Car(); // 자동차 클래스를 만들어줌
        ram.setName("람보르기니");
        Car po = new Car();
        po.setName("포르쉐");

        CarRacer lee = new CarRacer(); // 운전자 클래스를 만들어줌
        lee.setCar(po);
        lee.myCarInfo();

        lee.startUp();
        ram.startUp(); // 나는 포르쉐를 출력하고 있기 때문에 중간에 람보르기니가 시동이 걸리던 멈추던 상관없다.
        lee.go();
        lee.stop();
        lee.turnOff();

    }
}
