package com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {

        String id = "정한1";
        String id2 = "재희1";

        String pwd = "pass01";
        String pwd2 = "pass02";

        String name = "황정한";
        String name2 = "송재희";

        int age = 20;
        int age2 = 20;

        char gender = '남';
        char gender2 = '여';

        String[] hobby = new String[]{"축구","헬스","런닝"};
        String[] hobby2 = new String[]{"걷기","릴스시청","인사동"};

        //--------------------- 멤버라고 하는 타입을 지정해줬기 때문에 같은 id로 적혀 있어도 인스턴스로 묶이기 때문에 식별 가능

        Member hwang = new Member(); // 힙 메모리 영역에 생성되었고 hwang은 주소가 설정된 것
        Member song = new Member();

        hwang.id = "정한";
        song.id = "재희";

        hwang.pwd = "pass01";
        song.pwd = "pass01";

        hwang.name = "황정한";
        song.name = "송재희";

        hwang.gender = '남';
        song.gender = '여';

        hwang.age = 20;
        song.age = 22;

        hwang.hobby = new String[]{"축구","헬스","런닝"};
        song.hobby = new String[]{"걷기","릴스시청","인사동"};

        System.out.println(hwang);
        System.out.println(song);

    }
}
