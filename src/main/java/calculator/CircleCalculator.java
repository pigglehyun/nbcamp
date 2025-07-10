package calculator;

public class CircleCalculator extends Calculator {


    public CircleCalculator() {
        super();
    }

    public double calculate(int radius) {
        double result = Math.PI * radius * radius;
        getList().add(result);
        return result;
    }

}
