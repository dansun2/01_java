package com.ohgiraffers.section03.dto.problem1;

import java.util.ArrayList;

public class MemberRepository {
    
    ArrayList data = new ArrayList(); // 배열은 연속된 자료형. list는 끝에 자료값의 주소를 붙임
    
    public void addMember(String name, char gender, int age, String address, String phone) {
        data.add(name);
        data.add(gender);
        data.add(age);
        data.add(address);
        data.add(phone);
    }

    public void print(){
        System.out.println(this.data);
    }
}
