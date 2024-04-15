package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args){
        /*
        * 증감연산자
        * 피연산자의 앞 또는 뒤에 사용이 가능하다.
        * '**' : 1의 증가를 의미한다. 앞에 오면 먼저 증가시킨후 값을 더한다. 뒤에 있으면 먼저 연산하고 증가시킨다.
        * '--' : 1의 감소를 의미한다.
        * ++x or x++
         */
        int num = 0;
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(--num);
        System.out.println(num--);
    }
}
