package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    private int hp;

    // 몬스터의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자 함
    public void setHp(int hp){ // setHp 시작 //여기서 int hp는 무조건 매개변수값을 hp 라는 정수로 받고자 함
        // void인 이유는 리턴해 줄 필요가 X
        if(hp > 0){ // 여기서의 hp는 바로 윗줄의 정수 hp를 의미
            this.hp = hp; // 클래스형 자료형은 나를 지칭할 수 있다. 그래서 여기서의 this.hp는 클래스에 있는 hp(속성)고 뒤에 hp는
        }else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }
    } // setHp 종료

    public int getHp(){ //값을 가지는게 아니고, hp가 private하니까 값만 반환해주는 메서드를 따로 만들어줌
        return this.hp;
    }
}
