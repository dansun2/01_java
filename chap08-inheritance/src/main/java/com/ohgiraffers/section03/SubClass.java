package com.ohgiraffers.section03;

public class SubClass extends SuperClass {
//    아래의 private 메소드는 자식에서 접근할 수 없는 메소드로 재정의가 불가능하다.
//    private void privateMethod(){}
//    final 메소드는 변경할 수 없다는 것을 의미하며 이로 인해 재정의가 불가능하다.
//    private final void finalMethod(){}

    @Override
    public void method(int num) {
        super.method(num);
    }

//    @Override 부모보다 접근 범위를 좁게 만들 수 없다.
//    @Override
//    protected void method(int num) {
//        super.method(num);
//    }


//    @Override 메소드의 시그니처가 다른 경우 오버라이드 불가능
//    @Override
//    public void method(int num, int num2) {
//        super.method(num);
//    }

//    @Override 반환타입이 다른 경우 오버라이딩 불가능
//    @Override
//    public String method(int num) {
//        return "";
//    }


    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
