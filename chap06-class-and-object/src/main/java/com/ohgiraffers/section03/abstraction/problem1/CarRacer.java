package com.ohgiraffers.section03.abstraction.problem1;

public class CarRacer {

    private String name;

    private boolean isOn; //만들면 게터세터 붙어야댐

    public boolean isOn() {
        return isOn;
    }




    public void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
