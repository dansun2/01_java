package com.ohgiraffers.practice;

import java.util.Arrays;

public class Book {
    String bookName;
    String author;
    int num;
    String list[];
    String status;

    @Override
    public String toString() {
        return Arrays.toString(list);
    }


}
