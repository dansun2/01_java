package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Call {
    public static void main(String[] args) {
        Call col = new Call();
        String cc = col.call();
        System.out.println(cc);

        public String call() {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] target = input.split(" ");
            int result2=0;

            System.out.print("계산기 : ");
            if (target[1].equals("+")) { //string을 주소값을 기준으로 비교하는게 equals
                result2 = Integer.parseInt(target[0]) + Integer.parseInt(target[1]);
            }else if (target[1].equals("-")) {
                result2 = Integer.parseInt(target[0]) - Integer.parseInt(target[1]);
            }else if (target[1].equals("*")) {
                result2 = Integer.parseInt(target[0]) * Integer.parseInt(target[1]);
            }else if (target[1].equals("/")) {
                result2 = Integer.parseInt(target[0]) / Integer.parseInt(target[1]);
            }
            System.out.println(result2);
            return ""+result2;
        }
    }
}
