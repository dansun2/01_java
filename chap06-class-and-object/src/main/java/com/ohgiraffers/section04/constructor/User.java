package com.ohgiraffers.section04.constructor;

public class User {

    private String name;
    private int age;
    private String phone;

    public User(){ // 기본생성자라서 원래 쓰지 않아도 되지만 밑에 문단이 들어가면서 따로 입력도 받고 싶으면 이걸 입력해야함

    }

    public User(String name, int age, String phone){
        this.name = name; // name에 값을 넣어줌
        this.age = age; // age에 값을 넣어줌
        this.phone = phone; // phone에 값을 넣어줌
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
