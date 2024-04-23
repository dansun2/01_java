package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {

    private Car car; // = new Car와의 차이?

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
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
