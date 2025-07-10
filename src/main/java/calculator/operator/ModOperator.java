package calculator.operator;

public class ModOperator implements OperatorStrategy{
    @Override
    public double operate(double a, double b) {
        return a % b;
    }
}
