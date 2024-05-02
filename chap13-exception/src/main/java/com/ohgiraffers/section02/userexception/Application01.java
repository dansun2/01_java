package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {
    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();

        // 이렇게 쓰면 et.checkEnoughMoney(-100,200);
        // 첨엔 빨간줄이 뜨는데 시그니처(나를 호출한 쪽으로 다시 던지거나
        // 모어액션에서 트라이캐치구문으로 묶음

//        try {
//            et.checkEnoughMoney(100,200);
//
//            try{
//                et.checkEnoughMoney(100,-200);
//            }
//            catch (MoneyNegativeException e){
//                System.out.println("정신 차려~~~");
//            }
//        } catch (Exception e) {
//            System.out.println("상품 가격을 정수로 다시 입력해주세요.");
//        }

//        try{
//            et.checkEnoughMoney(-100,200);
//        }catch(PriceNegativeException e){
//            System.out.println("재품 가격이 음수야");
//        }catch(MoneyNegativeException e){
//            System.out.println("가진 돈이 음수야");
//        }catch(NotEnoughMoneyException e){
//            System.out.println("제품이 가진 돈보다 비싸");
//        }catch(Exception e){
//            System.out.println("뭐든 에러");
//        }

//        try {
//
//            et.checkEnoughMoney(100,200);
//            et.checkEnoughMoney(200,-200);
//
//            // try 구문은 에러가 발생이 되면 동작을 중단한다.
//            et.checkEnoughMoney(10,200);
//        } catch(Exception e){
//            //Exception은 모든 예외의 최상위 타입으로 아래의 예외를 검사하지 않음
//        } catch (PriceNegativeException e) {
//            System.out.println("제품의 가격이 음수일 수 없습니다.");
//        } catch (MoneyNegativeException e) {
//            System.out.println("가진 돈이 음수입니다.");
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("제품의 가격이 가진돈보다 비싸네요.");
//        }

        try {

            et.checkEnoughMoney(100,200);
            et.checkEnoughMoney(200,-200);

            // try 구문은 에러가 발생이 되면 동작을 중단한다.
            et.checkEnoughMoney(10,200);
        } catch (PriceNegativeException e) {
            System.out.println("제품의 가격이 음수일 수 없습니다.");
        } catch (MoneyNegativeException e) {
            System.out.println("가진 돈이 음수입니다.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("제품의 가격이 가진돈보다 비싸네요.");
        }
        System.out.println("쇼핑종료");
    }
}
