package com.ohgiraffers.order.dao;

import com.ohgiraffers.fakeDB.OrderDB;
import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderRepository {

    private final OrderDB orderDB = OrderDB.getInstance();
//    private static int count;
//    public static boolean store(OrderDTO[] dto) {
//        for (int i = 0; i<dto.length; i++){
//            aaa[count++] = dto[i];
//        }
//        return true;
//    }

    private final ArrayList orders = new ArrayList();

    public String order(OrderDTO[] orders){

        // 현재 주문 목록의 크기 저장. size는 해당 리스트의 크기를 반환한다.(=목록에 포함된 요소의 수를 나타냄).
        // 그리고 oldNum변수에 주문 목록의 크기를 저장함
        int oldNum = orderDB.getOrders().size();

        // 주문 목록에 orders배열의 길이만큼 주문 추가해서 orderDTO변수에 할당함
        for (OrderDTO orderDTO: orders) {
            orderDB.setItem(orderDTO);
        }

        // 주문 목록의 크기가 변하지 않았을 경우 등록 실패 메시지 반환
        if(oldNum >= orderDB.getOrders().size()){
            return "등록실패";
        }
        System.out.println(orders);
        return "등록성공";
    }

    public String orderDelete(int no) {
        int oldSize = orderDB.getOrders().size();
        orderDB.getOrders().remove(no);
        System.out.println(orderDB.getOrders());
        if(orderDB.getOrders().size() >= oldSize){
            return "주문 취소가 실패하였습니다.";
        }
        return "주문이 취소되었습니다.";

    }

    public String orderRead(){

        return ""+this.orders;
    }
}
