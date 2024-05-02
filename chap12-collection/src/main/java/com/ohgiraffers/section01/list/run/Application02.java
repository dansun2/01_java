package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comprator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {
        List<BookDTO> bookDTOList = new ArrayList<>(); // BookDTO객체를 담는 리스트. Arraylist는 크기가 가변적인 배열.

        // 배열에다가 값을 하나씩 넣어준다.
        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookDTOList.add(new BookDTO(5, "삼국유사", "일연", 58000));


        // bookDTOList에 들어간 값들을(?) 순회하면서 출력해줌
        // 여기서 bookDTO는 BookDTO객체를 대표하는 변수명이다.
        for (BookDTO bookDTO : bookDTOList){
            System.out.println(bookDTO);
        }


        List testList = new ArrayList();
        testList.add(1);
        testList.add("2");
        testList.add('a');
        testList.add(new BookDTO(1,"2","2",3));
//        for (Object test: testList){
//            System.out.println(test.toString());
//        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 제네릭의 타입제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort가 가능하다.
        // Collections.sort(bookDTOList);
        bookDTOList.sort(new AscendingPrice());

        System.out.println("가격 오름차순 정렬");
        for (BookDTO book : bookDTOList){
            System.out.println(book);
        }

        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                int result = 0;
                if(o1.getPrice() > o2.getPrice()){
                    result = 1;
                }else if (o1.getPrice() < o2.getPrice()){
                    result = -1;
                }else{
                    result = 0;
                }
                return result;
            }
        });
    }
}
