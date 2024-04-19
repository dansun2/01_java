package com.ohgiraffers.section01.array;

public class A_array {
    public void array(){
        /*
         * 배열이란?
         * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
         * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
         */

        /*
         * 배열의 사용 이유
         * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
         * 1. 연속된 메모리 공간을 관리할 수 없다.=>분산되어있지 않으니 어플리케이션의 성능이 올라감
         * 2. 반복문을 이용한 연속 처리가 불가능하다.
         */

        String bread = "식빵";

        //배열을 사용한다면
        //배열의 표현식
        //자료형[] 변수명 = new 자료형[길이]; // new라고 되어있는거 보면 동적인 공간을 필요로 하고 이 동적인 공간이heap
        String[] breads = new String[10];
        breads[0] = "식빵";
        breads[1] = "식빵";
        breads[2] = "식빵";
        breads[3] = "식빵";
        breads[4] = "식빵";
        breads[5] = "식빵";
        breads[6] = "식빵";
        breads[7] = "식빵";
        breads[8] = "식빵";
        breads[9] = "식빵";

//        for (int i = 0; i < 10; i++){ // 0~9까지 10개기떄문에 10이라는 인덱스가 없어서 오류난다
//            System.out.println(breads[i]);
//        }
        int[] iarr = new int[5]; // 자료를 만드는 방식은 int[] 자료형에 붙여도 되고
        char carr[] = new char[10]; // 변수명에 붙여도 된다
        System.out.println(iarr); //iarr의 주소값이 나옴
        iarr[2] = 10; // 2번째 인덱스라고 부르고 0은 0번쨰 인덱스라고 부름

        System.out.println(iarr[0]);


        System.out.println(iarr[2]);

        iarr = null; //원시 자료형들은 null을 포함할 수 없지만 heapㅇ..뭐더라?
        // 가비지컬렉터의 실행시점은 우리가 알 수 없다.
        // null로 주소를 없애놓는다고 가비지컬렉터가 회수해가는게 아니고 기냥 어? 안쓰네?하면 지가 갑자기 회수해간다
        System.out.println(iarr);

        int result = 100;
        int newArray[] = new int[result];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = 10;
        }
    }
}
