package com.ohgiraffers.section03.abstraction.problem2;

public class Application01 {

    public static void main(String[] args){
        Car car = new Car(); // 자동차 클래스를 만들어줌
        Car car1 = new Car();
        CarRacer carRacer = new CarRacer(); // 운전자 클래스를 만들어줌

        carRacer.startUp(car); //매개변수로 자동차가 필요함
        carRacer.go(car1);
        carRacer.stop(car1);
        carRacer.turnOff(car1);
    }
}
