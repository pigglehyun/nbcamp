package calculator.operator;

public class AddOperator implements OperatorStrategy{
    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}