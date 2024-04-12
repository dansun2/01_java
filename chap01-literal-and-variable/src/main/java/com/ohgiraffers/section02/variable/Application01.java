package com.ohgiraffers.section02.variable;

public class Application01 {
    public static void main(String[] args){
        /*
        * 변수의 사용 목적
        * 1. 값에 의미를 부여하기 위한 목적
        * 2. 한 번 저장해둔 값을 재사용 하기 위한 목적
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
         */

        System.out.println("======== 값에 의미 부여 테스트 ========");
        System.out.println("보너스를 포함한 급여 : " + (100000000 + 2000000) + "원");

        // 백만원 이하는 절삭
        int variable; //변수 선언문
        variable = 10; //변수 초기화


        int salary = 10; //변수는 주소고 주소를 알면 메모리의 값을 알 수 있음
        int bonus = 2;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        // 한 번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("========== 변수에 저장한 값 재사용 =========");
        System.out.println("1번 고객에게 100포인트 지급하였습니다.");
        System.out.println("1번 고객에게 110포인트 지급하였습니다.");
        System.out.println("1번 고객에게 120포인트 지급하였습니다.");
        System.out.println("1번 고객에게 130포인트 지급하였습니다.");
        System.out.println("1번 고객에게 140포인트 지급하였습니다.");
        System.out.println("1번 고객에게 150포인트 지급하였습니다.");
        System.out.println("1번 고객에게 160포인트 지급하였습니다.");
        System.out.println("1번 고객에게 170포인트 지급하였습니다.");
        System.out.println("1번 고객에게 180포인트 지급하였습니다.");

        System.out.println("변수를 사용하는 경우 ");
        int point = 100;
        System.out.println("1번 고객에게 포인트 "+point+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");


    }
}
