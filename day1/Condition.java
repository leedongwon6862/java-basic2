package day1;

import javax.swing.*;

public class Condition{
    public static void main(String[] args) {
        //조건문 > hi를 조건을 부여해 실행시킬지말지 컴퓨터에게 말하는것
        //if소중 >구조를 먼저 잡은다음 적는게 낫다.
        //if(실행될 조건){실행할 명령}
        int a = 100;
        if(a >50 ){System.out.println("hi");

        // 예제
        //소지금에 따른 야식 메뉴
        //20000만원 이상 : 치킨
        //20000만원 미만 : 떡볶이

        int money =30000;
            if(money >= 200000){
            System.out.println("치킨"); }

            if(money < 20000){  System.out.println("떡볶이");
}
        //1. 맑음 ,2.흐림 , 3.비,4.눈

        //맑음 : 날씨가 맑습니다. 나들이 가세요.
        //흐림 : 날씨가 흐립니다. 집에 계세요.
        //비 : 날씨가 비옵니다. 우산챙기세요.
        //눈 : 날씨가 눈옵니다. 눈사람을 만드세요.


            int weather = 1;

            if(weather == 1){System.out.println("날씨가 맑습니다. 나들이 가세요.");}
            else if(weather == 2){System.out.println("날씨가 흐립니다. 집에 계세요.");}
            else if(weather == 3){System.out.println(" 날씨가 비옵니다. 우산챙기세요.");}
            else if(weather == 4){System.out.println("날씨가 눈옵니다. 눈사람을 만드세요.");}

        //else 택일구조 - 그중하나만 선택하는 구조 >하나선택되는 순간 자바는 다른걸 따지지않는 >효율적이다





}}}