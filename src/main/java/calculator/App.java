package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try{
            boolean go = true ;
            //int index = 0;
            //int[] list = new int[10];
            Queue<Integer> list = new LinkedList<>() ;
            while ( go ) {
                Scanner sc = new Scanner(System.in);
                //1.1
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int firstNum;
                firstNum = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int secondNum;
                secondNum = sc.nextInt();
                //1.2
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operation;
                operation = sc.next().charAt(0);
                //1.3
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
                //1.7
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if ((sc.next()).equals("remove")) {
                    list.poll();
                }
                list.add(result);
                //1.4
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if ((sc.next()).equals("exit")) {
                    go = false;
                }
            }
        } catch ( ArithmeticException e) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
    }
}
