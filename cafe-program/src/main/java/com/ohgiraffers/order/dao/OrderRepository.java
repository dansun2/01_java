package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO){
        int oldNum = orders.size(); // 메뉴이름,
        orders.add(orderDTO);

        if(oldNum >= orders.size()){
            return "등록실패";
        }

        System.out.println(orders);

        return "등록성공";

    }

    public String orderRead(){
        StringBuilder ordersStringBuilder = new StringBuilder("주문 목록 : \n");
        // orders를 순회하면서 각 요소를 OrderDTO로 캐스팅하여 문자열로 변환 후 문자열에 추가
        for (OrderDTO orderDTO : orders) {
            ordersStringBuilder.append(orderDTO.toString()).append("\n");
        }
        return ordersStringBuilder.toString();
    }
}
