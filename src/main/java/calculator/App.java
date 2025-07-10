package calculator;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class App {
    public static void main(String[] args) {
        boolean go = true;
        //int index = 0;
        //int[] list = new int[10];
        Queue<Integer> list = new LinkedList<>();
        int result = 0;
        while (go) {
            try {
                Scanner sc = new Scanner(System.in);
                //1.1
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int firstNum = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int secondNum = sc.nextInt();
                //1.2
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operation;
                operation = sc.next().charAt(0);
                //2.2
                Calculator calculator = new Calculator();
                calculator.calculate(firstNum, secondNum, operation);
                //2.3
                result = calculator.getResult();
                System.out.println("결과: " + result);

                //1.7
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if ((sc.next()).equals("remove")) {
                    list.poll();
                }
                list.add(result);
                //1.8
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if ((sc.next()).equals("inquiry")) {
                    for (int l : list) {
                        System.out.print(l + " ");
                    }
                    System.out.println();
                }
                //1.4
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if ((sc.next()).equals("exit")) {
                    go = false;
                }
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } catch (IllegalArgumentException e) {
                System.out.println("연산자는 +, -, *, / 로 입력하세요.");
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
            }

        }
    }
}
