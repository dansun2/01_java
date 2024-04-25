package com.ohgiraffers.section02.uses;

public class MemberRepository {

    private final static Member[] members;

    private static int count;

    static{
        members = new Member[10];
    }
}
