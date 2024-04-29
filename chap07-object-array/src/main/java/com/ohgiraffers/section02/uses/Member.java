package com.ohgiraffers.section02.uses;

public class Member { // 사용자의 정보를 입력받기 위한 클래스

    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member(){

    }

    public Member(String id, String pwd, String name, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "회원정보 {" +
                "아이디='" + id + '\'' +
                ", 비밀번호='" + pwd + '\'' +
                ", 성함='" + name + '\'' +
                ", 나이=" + age +
                ", 성별=" + gender +
                '}';
    }
}
