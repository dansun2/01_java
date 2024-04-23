package com.ohgiraffers.section03.dto.problem2;

public class MemberDTO {

    private String name;
    private int age;
    private String address;
    private char gender;
    private String phone;
    // 프라이빗으로 만들어졌으면 무조건 게터세터 필요
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() { //이걸 안하면 주소값이 나오고 얘를 하면 필드값이 나온다
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
