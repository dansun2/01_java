package com.ohgiraffers.section02.looping;

public class B_while {

    public void testSimpleWhileStatement(){
        /*
        * [while문 표현식]
        * 초기식;
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문(반복할 구문);
        *   증감식;
        * }
        *
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문
        * }
         */

        // 1. 정수를 선언?



        // while문을 이용하여 구구단을 만들기

        // 1. 초기식작성
        // 2. while문의 조건식
        // 3. 중첩 while 조건식
        // 4. i*j 연산
        // 5. 출력
        // 6. 중첩에 있는 증감식
        // 7. while 증감식
        // 8. 중첩 while의 조건 변수 초기화

        int i = 2;
        //n단을 2부터 9까지 설정. 9가 될때까지 반복함
        while(i <= 9){ //반복해야하는 대상의 길이를 알 수 없을 때 사용한다.
            int x = 1;

            // n * m 에서 m을 9까지 반복함
            while(x <= 9){
                //출력
                System.out.print(i + " X " + x);
                System.out.println(" = " + (i*x));

                //m 부분 1씩 증가함
                x++;
            }

            //n 부분 1씩 증가
            i++;

            // *********뒷자리를 초기화해주지 않으면 m은 이미 값이 9가 되어있기때문에 다음단 동작안함
            // x=1; // 근데 x=1 을 while문에 넣어주면 초기화해줄 필요가 없다.


        }
    }


}
