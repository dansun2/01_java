package com.ohgiraffers.section02.uses;

import java.util.ArrayList;
import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 시스템 요구사항
        * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
         */

        // 사용자 정보를 입력받기 위함
        Scanner sc = new Scanner(System.in);

        // MemberService 클래스를 사용하기 위해 메모리에 올려줌
        MemberService memberService = new MemberService();

        ArrayList<Member> members = new ArrayList<Member>();
        int num=0;

        while(true){
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int no = sc.nextInt(); // 목차중에 어떤것을 실행할지 int로 받음
            switch(no){
                case 1 :
                    int keepgoing = 1;
                    while (keepgoing == 1) {
                        System.out.print("아이디를 입력하세요 : ");
                        String id = sc.next();
                        System.out.print("비밀번호를 입력하세요 : ");
                        String pwd = sc.next();
                        System.out.print("성함을 입력하세요 : ");
                        String name = sc.next();
                        System.out.print("나이를 입력하세요 : ");
                        int age = sc.nextInt();
                        System.out.print("성별을 입력하세요 : ");
                        char gender = sc.next().charAt(0);
                        members.add(new Member(id, pwd, name, age, gender));
                        num++;
                        System.out.println(members);
                        System.out.println("회원등록이 완료되었습니다.");
                        System.out.print("계속 등록하시려면 1번을 누르세요. ");
                        keepgoing = sc.nextInt();


                    }
                    break;







                case 2 : memberService.showAllMembers(); break;
                case 3 : System.out.println("프로그램을 종료합니다."); break;
                default :
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            } return;
        }

    }

}
