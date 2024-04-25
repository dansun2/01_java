package com.ohgiraffers.order.Register;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

public class OrderRegister {
    public void regist(OrderDTO[] aaa){
        System.out.println("메뉴를 추가합니다.");

        for (int i = 0; i < aaa.length; i++){
            System.out.println(aaa[i].getMenuName() + " " + aaa[i].getQuantity()
            + "잔을 주문서에 추가했습니다. 총 지불하실 금액은 " + aaa[i].getPrice()+
            "원 입니다.");
        }

        if(OrderRepository.store(aaa)){
            System.out.print("총 주문건은 "+aaa.length+"건 입니다.");
        }
    }
}
