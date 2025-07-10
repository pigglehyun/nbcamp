package calculator;

public class Calculator {

    //2.1
    public int calculate(int num1, int num2, char operation) {
        int result = 0 ;
        try {
            switch (operation) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        throw new ArithmeticException();
                    }
                    result = num1 / num2;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } catch ( IllegalArgumentException e) {
            System.out.println("연산자는 더하기, 빼기, 곱하기, 나눗셈 외 입력될 수 없습니다.");
        }
        return result;
    }

}
