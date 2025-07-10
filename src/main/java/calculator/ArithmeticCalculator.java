package calculator;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator() {
        super();
    }

    public double calculate(int num1, int num2, char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new IllegalArgumentException();
        }
        double result = 0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                result = (double) num1 / num2;
            }
        }
        getList().add(result);
        return result;
    }
}
