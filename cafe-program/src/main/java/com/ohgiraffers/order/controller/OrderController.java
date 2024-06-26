package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    private final OrderService orderService = new OrderService(); // 이거 왜 프라이빗? // 여기서부턴 생성자 이용해야함

    public String order(OrderDTO[] orders) {
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.

        for(OrderDTO orderDTO : orders) {
            if(orderDTO.getMenuName().equals("")){
                return "메뉴를 정해주세요";
            }

            if(orderDTO.getQuantity() <= 0){
                return "수량을 입력해주세요";
            }
        }


        //service 로직으로 넘겨줘야함
        String result = orderService.order(orders);
        return result;
    }


    public String orderRead() {
        orderService.orderRead();

        return orderService.orderRead();
    }

    public String orderDelete(int index) {
        return "삭제하기";
    }

    public String orderModify() {
        return "수정하기";
    }

    public String orderDetail() {
        return "상세조회하기";
    }



}
