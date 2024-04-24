package com.ohgiraffers.section04.dto;

import java.util.Date;

public class Application01 {

    public static void main(String[] args){
        UserDTO userDTO = new UserDTO("id","pwd","쏭",new Date());

        System.out.println(userDTO);


    }
}
