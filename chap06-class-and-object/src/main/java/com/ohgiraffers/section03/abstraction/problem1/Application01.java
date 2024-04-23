package com.ohgiraffers.section03.abstraction.problem1;

public class Application01 {

    public static void main(String[] args) {

        Car car = new Car();
        CarRacer carRacer = new CarRacer();
        carRacer.setName("이서현");

        // 자동차에 시동을 건다.
        car.setOn(true);
        if(car.isOn()){
            System.out.println("시동이 걸렸습니다.");
            System.out.println("자동차를 출발합니다.");

            // 자동차를 출발한다고 가정함
            carRacer.setOn(true);
            if(carRacer.isOn()){
                car.setSpeed(10);
            }
            System.out.println("자동차의 현재 속도 : " + car.getSpeed() + "km/h"); //setSpeed는 속도를 추가해줄때

            if(car.getSpeed() == 0){
                System.out.println("자동차의 시동을 끕니다");
                car.setOn(false);
            }
        }


    }
}
