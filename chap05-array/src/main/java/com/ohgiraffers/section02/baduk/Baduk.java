package com.ohgiraffers.section02.baduk;

import java.util.Scanner;

public class Baduk {
    public static void main(String[] args){
        Baduk baduk = new Baduk();
        baduk.baduk();
    }

    public void baduk(){
        String[][] board = new String[19][19]; // 바둑을 표현할 공간을 만듦

        for (int i = 0; i < board.length; i++){ //board는 [][]두갠데 앞줄갯순지 뒷줄갯순지 어떻게 알고?
            for (int j = 0; j < board[0].length; j++){ //왜 board[0]이 들어가지?
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2]; // 좌표찍기위해
        int turn = 0; // 트루/펄스 분리형으로 해줘도 됨
        while(!play.equals("exit")){ //조건이 되기 전까지 플레이가 되어야 함
            System.out.print(" 첫 좌표를 입력해주세요 : ");
            index[0] = scanner.nextInt();
            System.out.print(" 두 번째 좌표를 입력해주세요 : ");
            index[1] = scanner.nextInt();
            if (board[index[0]][index[1]].equals("[]")) { //공백이어야 돌을 놓을 수 있음
                if(turn % 2 == 0){ // 짝수인지 홀수인지. 턴제일때는 if가 들어갈 수 밖에 없음
                    board[index[0]][index[1]] = "흑";
                }
                else{
                    board[index[0]][index[1]] = "백";
                }
            }
            else{
                System.out.println("같은 위치에 바둑 돌을 놓을 수 없습니다.");
                turn += 2; // 같은 위치에 놓게되면 턴이 돌아가니까 +2를 해줌
                continue; // 다시 돌아감. 컨티뉴가 없으면 중복으로 놔도 밑줄로 내려가서 화면이 또 출력됨
            }



            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board[0].length; j++){
                    System.out.print(board[i][j]); // 바둑돌 놓은 위치 출력
                }
                System.out.println();
            }
            turn ++;
        }
    }
}