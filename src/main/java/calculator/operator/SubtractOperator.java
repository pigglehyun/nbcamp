package calculator.operator;

public class SubtractOperator implements OperatorStrategy{
    @Override
    public double operate(double a, double b) {
        return a - b;
    }
}
