package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {

    private Car car; // = new Car와의 차이?

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) { //카레이서한테 차를 주는 부분. 계층간에 데이터를 주고받을때 조금 더 편하게 주고 받을 수 있는 방법이 있음(DTO 클래스)
        // 보통 변경되는 객체에 쓴다. 다른사람도 접근할 수 있게
        this.car = car;
    }


    public void startUp(){
        this.car.startUp(); // 여기서의 car는 카레이서 안의 카
    }

    public void turnOff(){
        this.car.turnOff();
    }

    public void go(){
        this.car.go();
    }

    public void stop(){
        this.car.stop();
    }

    public void myCarInfo(){
        System.out.println(this.car.carName());
    }
}
