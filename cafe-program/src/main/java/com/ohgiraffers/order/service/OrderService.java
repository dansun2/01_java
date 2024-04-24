package com.ohgiraffers.order.service;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();
    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스에 대한 리소스를 관리한다.

    public String order(OrderDTO orderDTO){
        if(!orderDTO.getMenuName().equals("아메리카노")){
            return "주문 실패";
        }

        if(orderDTO.getPrice() <= 0){
            return "땅파서 장사하냐?";
        }
        // String result = orderRepository.order(orderDTO);
        return "주문 성공";
    }

    public String orderRead(){
        orderRepository.orderRead();    // 여기에 있는 경로에 있는 값을 받아온다
        return orderRepository.orderRead(); // 값
    }
}
