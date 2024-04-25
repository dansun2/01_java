package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderRepository {

    public final static OrderDTO[] aaa;
    private static int count;

    static{
        aaa = new OrderDTO[10];
    }

    public static boolean store(OrderDTO[] dto) {
        for (int i = 0; i<dto.length; i++){
            aaa[count++] = dto[i];
        }
        return true;
    }

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

        return ""+this.orders;
    }
}
