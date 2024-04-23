package com.ohgiraffers.section03.dto.problem2;

import java.util.ArrayList;

public class MemberRepository {
    
    ArrayList data = new ArrayList(); // 배열은 연속된 자료형. list는 끝에 자료값을 붙임
    
    public void addMember(MemberDTO member) {
        data.add(member);
    }

    public void print(){
        System.out.println(this.data);
    }
}
