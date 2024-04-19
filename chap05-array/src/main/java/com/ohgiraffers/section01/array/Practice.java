package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Practice {
    public void cafe(){
        System.out.println("***************메뉴판***************");
        System.out.println("***********************************");
        System.out.println("아메리카노 3000원");
        System.out.println("카페라떼 3500원");
        System.out.println("밀크티 5000원");
        System.out.println("바닐라라떼 3500원");
        System.out.println("밀크쉐이크 4500원");
        System.out.println("주문이 완료되면 . 을 입력하세요");
        System.out.println("---------------(부가세 포함입니다.)");
        System.out.println("***********************************" + '\n');


        // <배열을 *필수로* 이용하여 주문 시스템 만들기>
        // 1. 스캔준비
        // 2. 메뉴와 수량 변수 설정(?)
        // 3. 메뉴를 리스트로 명명하고 스캔받음
        // 4. if 사용하여 . 이 들어오면 주문 끝
        // 5. 나머지 다른 메뉴를 받았을때 가격을 합계에 더함
        // 6. 출력하기

        Scanner sc = new Scanner(System.in);

        String[] list = {"아메리카노","카페라떼","밀크티","바닐라라떼","밀크쉐이크"};

        int x = 0;

        System.out.print("주문을 원하시는 메뉴를 적으세요 : ");
        String menu = sc.nextLine();

        while (!menu.equals(".")) {
            if (menu.equals(list[0])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                x = 3000 * a;
            } else if (menu.equals(list[1])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                x = 3500 * a;
            } else if (menu.equals(list[2])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                x = 5000 * a;
            } else if (menu.equals(list[3])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                x = 3500 * a;
            } else if (menu.equals(list[4])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                x = 4500 * a;
            } else {
                System.out.println("없는 메뉴입니다.");
            }
        }System.out.println("주문이 없습니다. 처음부터 다시 시도하세요.");
        System.out.println("지불하실 금액은 " + x + "원 입니다.");






    }

}
