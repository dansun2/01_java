package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();

        boolean order = true;
        String order2 = "";
        String result = "";
        String result2 = "";


            while (order) {

                System.out.println("1. 주문 등록");
                System.out.println("2. 주문 삭제");
                System.out.println("3. 주문 수정");
                System.out.println("4. 주문 상세조회");
                System.out.println("5. 주문 전체조회");
                System.out.print("어떤 메뉴를 동작시키시겠습니까? ");

                int input = sc.nextInt();
                sc.nextLine();
                OrderDTO orderDTO = new OrderDTO(); // 이거 왜 들어가지?
                OrderRepository orderRepository = new OrderRepository();

                switch (input) {

                    case 1: // 주문 등록
                        System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                        orderDTO.setMenuName(sc.nextLine());
                        System.out.print("수량을 입력해주세요 : ");
                        int quantity = sc.nextInt();
                        System.out.print("가격을 입력해주세요 : ");
                        int price = sc.nextInt();

                        orderDTO.setQuantity(quantity, price);
                        result = orderController.order(orderDTO); // http에 담겨서 전달되는것 그 안에서 꺼내서 쓰면 된다

                        break;


                    case 2: // 주문 삭제
                        orderController.orderDelete();
                        break;


                    case 3: // 주문 수정
                        orderController.orderModify();
                        break;


                    case 4: // 주문 상세조회
                        orderController.orderDetail();
                        break;


                    case 5: // 주문 전체조회
                        orderRepository.orderRead;
                        result = orderController.orderRead(orderDTO);


                        break;


                    default:
                        System.out.println("입력이 잘못되었습니다.");
                        break;

                }

                System.out.println(result);

                System.out.println("주문을 종료하시겠습니까? ");
                order = sc.nextBoolean();


            }
        }


}
