package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO){
        int oldNum = orders.size(); // 잘 이해안감
        orders.add(orderDTO);
        if(oldNum > orders.size()){
            return "등록실패";
        }
        System.out.println(orders);

        return "등록성공";

    }

    public String orderRead(OrderDTO orderDTO){
        System.out.println('\n' + "현재 주문하신 메뉴는 " + '\n' + orderDTO.getMenuName() + " "
                + orderDTO.getQuantity() + "잔" + '\n'
                + "총 지불하실 금액은 " + orderDTO.getPrice() + "원 입니다.");

        return orderDTO.getMenuName();
    }


}
