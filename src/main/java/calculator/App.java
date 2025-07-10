package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            //1.1
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum ;
            firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum ;
            secondNum = sc.nextInt();
            //1.2
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operation;
            operation = sc.next().charAt(0);

            int result = 0;
            switch (operation) {
                case '+' -> result = firstNum + secondNum;
                case '-' -> result = firstNum - secondNum;
                case '*' -> result = firstNum * secondNum;
                case '/' -> {
                    if (secondNum == 0) {
                        throw new ArithmeticException();
                    }
                    result = firstNum / secondNum;
                }
            }

            System.out.println("결과: " + result);
        } catch ( ArithmeticException e) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }


    }
}
