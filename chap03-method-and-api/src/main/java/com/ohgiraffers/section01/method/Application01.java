package main.java.com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args){
        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         */

        System.out.println("main() 시작됨....");

        Application01 app1 = new Application01(); //메모리에 올리는 문법. 올리기전까지는 그냥 텍스트일뿐
        app1.methodA();

        System.out.println("main() 종료됨..");
    }

    public void methodA(){
        System.out.println("methodA() 시작됨");
        methodB();
        System.out.println("methodA() 종료됨");
    }

    public void methodB(){
        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");
    }

    public void methodC(){
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");
        return;
        // 원래 모든 메소드가 리턴문을 만나야 끝나는데 void형에서는 반환타입이 없기때문에(리턴할게 없어서) 반환할필요가X
        // return; <- 원래는 이걸 써야 하는데 회색처리되는건 굳이 안써도 될것같다고 인텔리제이가 힌트주는거
        // int, long, 참조자료 등등등은 return을 필수로 써줘야함
    }

}
