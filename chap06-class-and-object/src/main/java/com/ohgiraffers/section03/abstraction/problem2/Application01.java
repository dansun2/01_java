package com.ohgiraffers.section03.abstraction.problem2;

public class Application01 {

    public static void main(String[] args){
        Car car = new Car(); // 자동차 클래스를 만들어줌
        Car car1 = new Car();
        CarRacer carRacer = new CarRacer(); // 운전자 클래스를 만들어줌

        carRacer.startUp(car); //매개변수로 car를 넣어줌
        carRacer.go(car1);
        carRacer.stop(car1);
        carRacer.turnOff(car1);

        car.go(); // 자동차는 카레이서 없이도 출발 가능

    }
}
