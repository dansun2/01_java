package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {
    ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO){
        orders.add(orderDTO);
    }
}
