package com.ohgiraffers.section01.polymorpshism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다.");
    }

    public void jump(){
        System.out.println("토끼가 점프합니다.");
    }
}
