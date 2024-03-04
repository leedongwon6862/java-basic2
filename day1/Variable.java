package day1;

public class Variable {
    public static void main(String[] args) {
        // 변수 = 데이터를 저장하는 그릇(공간)

        System.out.println(10);
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);
        //10출력이아니고 40이었던것이다. >숫자를바꾸려면 괄호안 모두 다바꿔줘야함 >번거로움>변수사용

        //변수를 사용하려면 변수 선언 = 변수타입(그릇의 모양과크기) 변수명;

        //숫자형 변수
        int number;
        //자바에서 int는 정수를 뜻함

        //변수의 값 저장 > number라는 상자에 숫자 40저장한것 ,순서 지킬것(변수가 왼쪽 , 저장대상 오른쪽)
        number = 40;

        int number2;

        // number2 ="차태진" > 숫자면수에 문자를 저장하려고 하면안된다.

        String str;
        //String 이 자바에서 문자열를 뜻함
        str ="차태진";

        //변수에 저장되어있는 값을 사용하기
        //변수명을 값처럼 사용
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        // 40을 또 50 으로 바꾸고 싶으면 number 라는 변수의 값을 50으로만 바꾸면된다. >문자도 동일

        //자기소개 10번 출력 > 안녕하세요 ~~살  ~~입니다.

        String ldw;
        ldw ="안녕하세요 38살 차태진입니다.";

        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        System.out.println(ldw);
        //나이 변하게 하기 > aaa 로 x age로 o 예측가능하게 저장해놔야함 >변수명을 잘지어야함
        int age;
        age = 39;
        //이름 변하게 하기
        String name2;
        name2 = "차태진";

        //변수 주의사항 > 변수명은 중복되지 않도록 지어야한다 , 변수명은 특수문자,숫자 x
        //변수는 재활용가능하다. >> 이미존재하는 변수에 새로운값 저장하면 새로운값으로 된다








}}