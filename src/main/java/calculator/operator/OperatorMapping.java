package calculator.operator;

import java.util.HashMap;
import java.util.Map;

public class OperatorMapping {

    //private static Map<Character, OperatorStrategy> operatorMap = new HashMap<>();
    private static Map<Character, OperatorType> operatorMap = new HashMap<>();

    static {
//        operatorMap.put('+', new AddOperator());
//        operatorMap.put('-', new SubtractOperator());
//        operatorMap.put('/', new DivideOperator());
//        operatorMap.put('*', new MultiplyOperator());
//        operatorMap.put('%', new ModOperator());
        operatorMap.put('+', OperatorType.ADD);
        operatorMap.put('-', OperatorType.SUBTRACT);
        operatorMap.put('*', OperatorType.MULTIPLY);
        operatorMap.put('/', OperatorType.DIVIDE);
        operatorMap.put('%', OperatorType.MOD);
    }

    public static OperatorType getOperator(char operator) {
        return operatorMap.get(operator);
    }
//    public static OperatorStrategy getOperator(char operator) {
//        return operatorMap.get(operator);
//    }
}
