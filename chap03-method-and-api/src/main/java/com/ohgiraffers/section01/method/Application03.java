package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        int result = app3.plus(x, y);
        System.out.println(result);

        int result2 = app3.minus(y, x);
        System.out.println(result2);

        int result3 = app3.rhq(x, y);
        System.out.println(result3);

        int result4 = app3.sksn(x, y);
        System.out.println(result4);

        String info = app3.myInfo("이서현", 33, 'F', "010-8025-2700");
        System.out.println(info);

        System.out.println(app3.myInfo("이서현", 33, 'F', "010-8025-2700"));
        // 메모리 스택에 처음 메인-프린트-마이인포 순으로 깔려있어서 마이인포 함수 먼저 실행~리턴문을 만나면 끝남

    }
        // 더하기 함수
        // 접근제어자 반환타입 함수명(매개변수){}
        public int plus(int x, int y) { //함수는 무조건 인트를 반환하도록 되어있음.
            int result = x + y;
            return result;
        }

        public int minus(int y, int x) {
            int result2 = y - x;
            return result2;
        }

        public int rhq(int x, int y) {
            int result3 = x * y;
            return result3;
        }

        public int sksn(int x, int y) {
            int result4 = x / y;
            return result4;
        }

        // 1. myInfo 함수 만들기
        // 2. 매개변수 (String name, int age, char gender, String phone)
        // 3. 매개변수 더하기 String result = name + age + gender + phone
        // 4. return result
        // 이게 이해가 안되면 함수만드는방법 함수이름붙이는 방법부터

        public String myInfo(String name, int age, char sex, String number){
            String result = name + age + sex + number;
            return result;
        }
}
