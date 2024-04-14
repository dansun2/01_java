package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // OrderController 객체를 생성하여 등록, 삭제, 수정, 조회 등의 기능을 호출하고 관리함
        // 객체를 생성하지 않고는 해당 클래스의 메서드를 호출하거나 속성에 접근할 수 없다.
        OrderController orderController = new OrderController();

        // 주문 프로그램 계속 진행 여부를 나타내는 변수 초기화
        boolean order = true;

        // 처리 결과를 저장할 문자열 변수 초기화 (지역변수를 반드시 초기화해서 사용해야함. 트래쉬값 방지..?)
        String result = "";
        int index;
        while(order){
            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠나요? ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1 : // 주문등록
                    System.out.print("몇개의 음료를 주문하시겠나요? : ");
                    int cnt = sc.nextInt();
                    sc.nextLine();
                    OrderDTO[] orders = new OrderDTO[cnt];
                    for (int i = 0; i < orders.length; i++) {
                        System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                        String menuName = sc.nextLine();
                        System.out.println("수량을 입력해주세요 :");
                        int quantity = sc.nextInt();
                        System.out.println("가격을 입력해주세요 : ");
                        int price = sc.nextInt();
                        orders[i] = new OrderDTO(menuName, quantity, price);
                        sc.nextLine();
                    }
                    result = orderController.order(orders);
                    break;

                case 2 : // 주문삭제
                    System.out.print("삭제할 제품의 번호를 입력해주세요 : ");
                    index = Integer.parseInt(sc.nextLine());
                    result = index + "번 ";
                    result += orderController.orderDelete(index);
                    break;

                case 3 : // 주문 수정
                    System.out.println(orderController.orderRead());
                    System.out.print("수정할 메뉴 번호를 입력해주세요 : ");
                    index  = sc.nextInt();
                    sc.nextLine();
                    System.out.print("메뉴 이름을 수정해주세요 : ");
                    String name = sc.nextLine();
                    System.out.print("메뉴 가격을 수정해주세요 : ");
                    int price = Integer.parseInt(sc.nextLine());
                    System.out.print("주문 수량을 주정해주세요 : ");
                    int quantity = Integer.parseInt(sc.nextLine());
                    OrderDTO modifyOrder = new OrderDTO(name,price,quantity);
                    result= orderController.orderModify(index, modifyOrder);
                    break;

                case 4 : // 주문 상세조회
                    System.out.println(orderController.orderRead());
                    System.out.println("상세 조회할 제품 번호를 입력해주세요");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = orderController.orderDetail(num);
                    break;

                case 5 :// 주문 전체조회
                    result = orderController.orderRead();
                    break;

                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);

            System.out.print("주문을 종료하시겠나요?");
            order = sc.nextBoolean();
        }
    }
}
