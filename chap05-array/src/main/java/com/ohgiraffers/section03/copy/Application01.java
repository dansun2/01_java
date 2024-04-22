package com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {

        // 얕은 복사 : 주소를 공유한다. 원본 배열에 영향을 받기 때문에 주의해야함
        String[] goldSideName = {"김재석", "송재희", "황정한"};
        String[] names = goldSideName;
        System.out.println(goldSideName);
        System.out.println(names);

        goldSideName[0] = "김효주";

        System.out.println(goldSideName[0]);
        System.out.println(names[0]);
        System.out.println("--------------깊은복사--------");


        // 깊은 복사 : 값을 공유한다.
        goldSideName = new String[]{"김재석", "송재희", "황정한"}; // 변수명을 새롭게 할당하는것이 불편해서 임시로 재사용한것
        // 주소값 초기화
        names = new String[3];

        // for each문
        int i = 0;
        for (String name : goldSideName) { // 순차적으로 length만큼 반복해준다
            names[i] = name;
            i++;
        }

        goldSideName[0] = "이상우";
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);


        for (String name : names) {
            System.out.println(name);
        }


    }
}
