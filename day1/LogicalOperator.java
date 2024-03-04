package day1;

public class LogicalOperator {
    public static void main(String[] args) {
        //논리연산자
        // &&(And) =둘다 true 일때만 true
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        //||(Or) = 둘다 false 일때만 false
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        //1+2+5+5 과마찬가지로 앞에서부터 순차적으로 계산한다
        System.out.println(true || false || true || false);

        System.out.println(10 > 20 && 1 != 1 && 3 > 2); //false ?? true ??






    }
}
