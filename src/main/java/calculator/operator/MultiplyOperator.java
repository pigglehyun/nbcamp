package calculator.operator;

public class MultiplyOperator implements OperatorStrategy{
    @Override
    public double operate(double a, double b) {
        return a * b;
    }
}
