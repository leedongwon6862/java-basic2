public class Main {
        //자바 프로그램 시작과 종료지점
    public static void main(String[] args) {
        // >각주 나의 코멘트 작성할떄 쓰임 > 컴퓨터가 못읽기때문

        //숫자 출력
        System.out.println(100);
        System.out.println(200);

        //프로그램은 위에서 아래로 순차적 실행된다.

        //문자 출력 "" 해줘야된다
        System.out.println("차태진");
        System.out.println("홍길동");

        //숫자 ,문자 아무거나 10개정도 출력

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("이동원");
        System.out.println("가");

        // \n은 줄바꿈
        System.out.println("안녕하세요" + "\n" +"반갑습니다.");
        System.out.println("안녕하세요\n반갑습니다.");

        //문자 합치기
        System.out.println("안녕하세요 차태진입니다.");
        System.out.println("안녕하세요" + "차태진입니다");

        //숫자 더하기
        System.out.println(100 + 200);
        System.out.println(2000 + 3000);

        System.out.println("100"); //문자
        System.out.println(100); //숫자

        System.out.println("100" + "200");
        System.out.println(100 + 200);

        //문자 +숫자 > 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        //출력문을 이용해 더하기 식 표현하기
        //+연산자가 여러번 나오면 왼쪽부터 순차적으로 연산한다
        System.out.println("123124 + 56563 = " + 123123 + 54563);
        //즉
        System.out.println("123124 + 56563 = " + (123124 + 54563));

        //숫자 곱하기 (*)
        System.out.println(100 * 200);

        //구구단 2단을 출력해주세요. 단 출력문은 한번만 사용.
        System.out.println("2 x 1 = "+ (2*1) +"\n" + "2 x 2 ="+ (2*2) + "\n" + "2 x 3 ="+ (2*3) +"\n" + "2 x 4 ="+ (2*4)+"\n"+ "2 x 5 ="+(2*5));


    }
}