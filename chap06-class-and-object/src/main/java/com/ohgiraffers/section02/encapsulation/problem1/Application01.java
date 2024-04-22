package com.ohgiraffers.section02.encapsulation.problem1;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
        Monster drunkTiger = new Monster();
        drunkTiger.name = "드렁큰타이거";
//        drunkTiger.hp = -100;

        System.out.println(drunkTiger.name);
//        System.out.println(drunkTiger.hp);
        // -------  직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.

        int hp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("주황버섯의 체력 : ");
        Monster monster = new Monster();
        monster.name = "주황버섯";
        hp = sc.nextInt();
        monster.setHp(hp);
//        System.out.println(monster.hp); // 클래스형 자료형들은 무조건 기본값을 가짐. int 정수형의 기본값은 0
//        monster.hp = -100;
        System.out.println(monster.getHp());

    }
}
