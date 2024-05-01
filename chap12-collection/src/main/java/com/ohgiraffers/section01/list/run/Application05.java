package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {

    public static void main(String[] args) {
        /*
        * queue
        * Queue는 선형 메모리 공간에 데이터를 저장하는 선입선출(FIFO - First Input First Out)방식의 자료구조이다.
        * queue 인터페이스를 상속받는 하위 인터페이스들은
        * Deque, BlockingQueue, TransferQueue등 다양하지만 대부분의 큐는 LinkedList를 이용한다.
         */

        // Queue 자체로 인터페이스이기 때문에 인스턴스 생성이 불가능하다.
//        Queue<String> que = new Queue();

        Queue<String> que = new LinkedList<>();

    }
}
