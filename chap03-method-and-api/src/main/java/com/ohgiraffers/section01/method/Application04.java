package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args){
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator(); // 신 메모리에 올리는거

        int min = cal.minNumberOf(first, second); //int min이라는 변수를 만듦
        System.out.println(min);

        int max = Calculator.maxNumberOf(first, second);
        //static안에 들어가있기 때문에 Application 01,02,03,04 모두에서(전역공간에) maxNumberOf가 호출 가능하다
        //그래서 static이 붙어있는 파일같은경우는 클래스를 지정해줘야한다 (그래서 Calculator 파일에 있다는걸알려줘야함)
        //누구든지 어디든지 써야하는 파일같은곳에 많이 씀. ex)인증할때. 근데 static은 상대적으로 메모리 공간이 적어서 꼭 필요한것만 넣어야함.

        System.out.println(max);
    }
}
