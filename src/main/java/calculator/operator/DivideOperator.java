package calculator.operator;

public class DivideOperator {
    public double operate(double a, double b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}