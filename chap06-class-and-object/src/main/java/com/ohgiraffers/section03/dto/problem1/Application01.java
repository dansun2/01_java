package com.ohgiraffers.section03.dto.problem1;

public class Application01 {

    public static void main(String[] args) {

        String name = "송재희";
        char gender = '여';
        int age = 20;
        String phone = "010-1234-1234";
        String address = "인사동";

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(name, gender, age, address, phone); // 매개변수의 갯수랑 순서를 맞춰줘야함


        String name1 = "김재석";
        char gender1 = '남';
        int age1 = 19;
        String phone1 = "010-1234-1234";
        String address1 = "고잔동";

        memberRepository.addMember(name1, gender1, age1, address1, phone1);
        memberRepository.print(); // 데이터가 늘어날수록 누구의 데이터인지 알 수가 없음 //+전화번호나 주소 공개하기 싫을때 다시 빈값으로 만들어놔야한다는 문제
    }  // 그래서 DTO를 쓴다
}
