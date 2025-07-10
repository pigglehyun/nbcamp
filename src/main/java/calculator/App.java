package calculator;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class App {
    public static void main(String[] args) {
        boolean go = true;
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();
        Scanner sc = new Scanner(System.in);
        while (go) {
            try {
                System.out.print("사칙연산 or 원 ? ");
                String decide = sc.next();

                if (decide.equals("사칙연산")) {
                    //1.1
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    double firstNum = sc.nextDouble();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    double secondNum = sc.nextDouble();
                    //1.2
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operation = sc.next().charAt(0);

                    //3.2
                    System.out.println("결과: " + arithmeticCalculator.calculate(firstNum, secondNum, operation));

                    //1.7
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                    if ((sc.next()).equals("remove")) {
                        arithmeticCalculator.removeResult(); // 2.4
                    }
                    //1.8
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    if ((sc.next()).equals("inquiry")) {
                        arithmeticCalculator.inquiryResults(); // 2.5
                    }
                } else if (decide.equals("원")) {
                    System.out.print("원의 반지름을 입력하세요: ");
                    int radius = sc.nextInt();
                    double result = circleCalculator.calculate(radius);
                    System.out.println("결과: " + result);
                    //1.8
                    System.out.println("저장된 연산결과");
                    circleCalculator.inquiryResults(); // 2.5
                } else {
                    throw new InputMismatchException();
                }

                //1.4
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if ((sc.next()).equals("exit")) {
                    go = false;
                }


            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                sc.nextLine(); // 버퍼 비우기
            } catch (IllegalArgumentException e) {
                System.out.println("연산자는 +, -, *, / 로 입력하세요.");
                sc.nextLine(); // 버퍼 비우기
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine(); // 버퍼 비우기
            }

        }
    }
}
