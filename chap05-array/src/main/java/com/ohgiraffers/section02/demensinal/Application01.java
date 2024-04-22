package com.ohgiraffers.section02.demensinal;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 다차원 배열
        * 타차원 배열은 2차원 이상의 배열을 의미한다.
        *
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
        * 더 많은 차원의 배열은 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용빈도가 적다.
         */

        /*
        * 2차원 배열을 사용하는 방법.
        * 1. 배열의 주소를 보관할 래퍼런스 변수를 선언(stack)
        * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
        * 4. 생성한 여러 개의 1차원 배열을 차례로 접근해서 사용
        * 표현식
        * 자료형[][] 변수명 = new 자료형[길이][길이]
         */

        int[][] iarr1; // 참조변수. 아직 heap 영역에 올라가지 않아서 주소가 할당되지 않음.
        int iarr2[][];
        int[] iarr3[];

        iarr1 = new int[3][3]; // heap 영역에 메모리를 할당해줌
//        System.out.println(iarr1[0][0]);

        iarr2 = new int[3][5];

        iarr1 = new int[3][]; // 배열의 길이를 갖지 않는다.
        iarr1[0] = new int[5];
        iarr1[1] = new int[4];
        iarr1[2] = new int[2];

//        iarr1[3] = new int[6]; //런타임익셉션(실행중에 발생한다)

        int a = 1;
        int b = 1;
 //       iarr4 = new int[a][b]; // 바둑판 크기 설정


//        System.out.println(iarr1[2][0]);

        // 바둑판 만들기 30 x 30
        // 1. 바둑판 만들 변수 생성
        // 2. 가로세로 길이 설정 (판생성)
        // 4. 출력은 기본은 0, 흑(9), 백(5)이 들어간다.
        // 4. 백돌부터 숫자를 받는다.
        // 5. 숫자를 받고 나서 그 자리에 0이 출력되어 있는 자리인지 확인(돌이 있나 없나)
        // 6. 흑돌받는다.
        // 7. 5번반복


        while(a < 31) {
            while (b < 31) {
                System.out.print("0 ");
                if (b == 30){
                    System.out.print('\n');
                }
                b++;
            }
            b=1;
            a++;
            System.out.print("0 ");
        }






    }
}
