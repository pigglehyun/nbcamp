package calculator;

public class Calculator {

    //2.1
    private int result;

    public void calculate(int num1, int num2, char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new IllegalArgumentException();
        }
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
    }

    //2.3
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
