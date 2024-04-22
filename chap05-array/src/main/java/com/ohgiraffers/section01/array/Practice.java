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
        // 4. while 사용하여 . 이 들어올때까지 주문을 받음
        // 5. 나머지 다른 메뉴를 받았을때 가격을 합계에 더함
        // 6. 출력하기

        // ***** 오류: 주문을 받으면 수량받을때 무한반복됨..수량을 받고 다시 돌아가서 다른메뉴를 받아야 하는데..

        Scanner sc = new Scanner(System.in);

        String[] list = {"아메리카노","카페라떼","밀크티","바닐라라떼","밀크쉐이크"};

        int x = 0;
        String b = "주문을 원하시는 메뉴를 적으세요 : ";
        ///
        String menu = ""; // int a=0; 초기화랑 똑같음

        while (!menu.equals(".")) {
            System.out.print(b); //
            menu = sc.nextLine(); //
            if (menu.equals(list[0])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                sc.nextLine(); // 위에서 정수를 받았기 때문에 ..? 서블릿 //사용자가 응답할 수 있도록 뭔가 만들어줌
                x = 3000 * a;

            } else if (menu.equals(list[1])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                sc.nextLine();
                x = 3500 * a;

            } else if (menu.equals(list[2])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                sc.nextLine();
                x = 5000 * a;

            } else if (menu.equals(list[3])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                sc.nextLine();
                x = 3500 * a;

            } else if (menu.equals(list[4])) {
                System.out.print("수량을 입력하세요 : ");
                int a = sc.nextInt();
                sc.nextLine();
                x = 4500 * a;

            } else {
                System.out.println("없는 메뉴입니다.");
            }
        }System.out.println("주문이 없습니다. 처음부터 다시 시도하세요.");
        System.out.println("지불하실 금액은 " + x + "원 입니다.");
    }
}
