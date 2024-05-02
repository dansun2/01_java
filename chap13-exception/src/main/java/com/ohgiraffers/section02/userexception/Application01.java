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

        try{
            et.checkEnoughMoney(-100,200);
        }catch(PriceNegativeException e){
            System.out.println("재품 가격이 음수야");
        }catch(MoneyNegativeException e){
            System.out.println("가진 돈이 음수야");
        }catch(NotEnoughMoneyException e){
            System.out.println("제품이 가진 돈보다 비싸");
        }catch(Exception e){
            System.out.println("뭐든 에러");
        }

        try {
            et.checkEnoughMoney(-100,200);
        } catch (PriceNegativeException e) {
            throw new RuntimeException(e);
        } catch (MoneyNegativeException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            throw new RuntimeException(e);
        }

        System.out.println("쇼핑종료");
    }
}
