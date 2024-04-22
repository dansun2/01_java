package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Customer seohyun = new Customer();
        Customer seung = new Customer();
        Customer seok = new Customer();

        seohyun.name = "이서현";
        seung.name = "우승엽";
        seok.name = "이은석";

        seohyun.address = "서초구";
        seung.address = "동작구";
        seok.address = "강서구";

        seohyun.phone = 1080252700;
        seung.phone = 1012341234;
        seok.phone = 1056785678;

        System.out.println('\n' + "*** 도서 대여는 한 권만 가능합니다. ***" + '\n');
        System.out.println("----------- 대여 가능한 도서 목록 -----------");


        String[] list = {"스프링 입문을 위한 자바 객체 지향의 원리와 이해","내 몸 혁명","저스트고 북유럽 3개국"};
        String[] bookAuthor = {"김종민","박용우","백상현"};
        int[] bookNumber = {1,2,3};
        Book[] books = new Book[3];

        for (int i = 0; i < list.length; i++) {
            books[i].bookName = list[i];

            System.out.print("도서번호 "+bookNumber[i]);
            System.out.print(" / "+bookAuthor[i]);
            System.out.println(" / "+list[i]);
        }

//        Book java = new Book();
//        Book body = new Book();
//        Book go = new Book();
//
//        java.bookName = "스프링 입문을 위한 자바 객체 지향의 원리와 이해";
//        body.bookName = "내 몸 혁명";
//        go.bookName = "저스트고 북유럽 3개국";
//
//        java.author = "김종민";
//        body.author = "박용우";
//        go.author = "백상현";
//
//        java.num = 1;
//        body.num = 2;
//        go.num = 3;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);


        System.out.print("회원이름 : ");
        String name = sc.nextLine();
        System.out.print("대여를 원하시는 도서 번호를 입력하세요. : ");
        int a = 0;
        a = sc.nextInt();
        a--;
        System.out.println("< " + list[a] + " >");
        System.out.println("이 책을 대여하시겠습니까? ( 네 / 아니오 )");
        String response = sc1.nextLine();
            if(response.equals("네")){
                System.out.println("대여가 완료되었습니다." + '\n');
                System.out.println("회원명 : " + name);
                System.out.println("대여 도서 : " + list[a]);
                System.out.println("반납일 : 2024-04-27");
            }else{

            }

    }
}
