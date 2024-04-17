package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner; //여기에는 안보이지만 jdk에 따로 java.util패키지가 있는것

public class Application01 {
    public static void main(String[] args){

        //System.in은 뭔가 입력을 받을 수 있게 하는 조건
        //메모리에 올려줘야함 변수명sc=메모리 주소=값. Scanner는 자바를 쓰는 사람들이 만든 자료형

        Application01 app = new Application01();
        String info = app.inputInfo();
        System.out.println(info);


        // 1. infoInput 함수 만들기 ( 접근제어자 반환타입 메서드명(){} )
        // 2. 입력을 받는거라 매개변수가 필요없음. 값을 입력받는다.
        // 3. 키 나이 성별 이름을 입려받아 문자열로 합친다.
        // 4. 문자열로 반환한다.
    }

    public String inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine(); // nextLine은 입력된값이 무엇이든 문자열로 받아주는 함수

        System.out.print("당신의 키를 입력해주세요 : ");
        double height = sc.nextDouble();
        sc.nextLine(); // int도 그렇고 double도 그렇고 enter친 것 까지 자료가 남아서 초기화안해주면 다음 성별부분에 이게 남는다.

        System.out.print("당신의 성별을 입력해주세요 : ");
        char gender = sc.nextLine().charAt(0); //charAt(0)를 쓰는 이유는 가장 0번째 인덱스(첫글자)를 따오기 위해

        System.out.print("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        sc.nextLine(); // nextInt가 띄어쓰기 전까지의 값만 가져오기 때문에 남은 글자는 버퍼에 담긴다. 그래서 초기화를 한 번 해줌.

        return "당신의 이름은 " + name + "입니다. \n" + "당신의 키는 " + height + "입니다. \n" +
                "당신의 성별은 " + gender + "입니다. \n" + "당신의 나이는 " + age + "세 입니다. \n";

    }
}
