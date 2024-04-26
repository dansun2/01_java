package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

//    public Car() {
//        super(); // 이거는 expends가 없는데 뭘 상속받냐면 object를 상속받음. 근데 안써도 자바에서 기본으로 생성해줌. //부모의 생성자를 내가 가져옴
//    }

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵! 빵!");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

//    private boolean isRunning() { // private이랴서 자식이 쓸 수 없음
    protected boolean isRunning(){
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
}
