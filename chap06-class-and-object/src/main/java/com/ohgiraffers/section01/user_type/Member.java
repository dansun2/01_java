package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Member {
    // 클래스의 변수 / 속성 / 필드
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

    @Override
    public String toString() {
        return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + '\n' + "hobby=" + Arrays.toString(hobby);
    }

}
