package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate; // 날짜를 저장할 수 있는 자바 자료형

    // 접근제어자 클래스명(){}

    // 기본 생성자
    public UserDTO(){}

    // 전체 필드를 초기화하는 생성자
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String getId(){
        return id;
    }

    // 왜 여기는 void타입?
    public void setId(String id){
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

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }


    @Override // 어노테이션:골뱅이로 시작됨. 특별한 기능을 가진것들(자바에서 미리 약속이 되어 있음) // object가 갖고 있는 것을 재정의
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
