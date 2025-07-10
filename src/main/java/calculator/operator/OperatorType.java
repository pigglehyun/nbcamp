package calculator.operator;

import java.lang.reflect.GenericArrayType;

public enum OperatorType {

    ADD {
        @Override
        public double operate(double num1, double num2) {
            return
                    num1 + num2;
        }
    },
    SUBTRACT {
        @Override
        public double operate(double num1, double num2) {
            return num1 - num2;
        }
    },
    DIVIDE {
        @Override
        public double operate(double num1, double num2) {
            if (num2 == 0) throw new ArithmeticException();
            return num1 / num2;
        }
    },
    MULTIPLY {
        @Override
        public double operate(double num1, double num2) {
            return num1 * num2;
        }
    },
    MOD {
        @Override
        public double operate(double num1, double num2) {
            return num1 % num2;
        }
    };

    public abstract double operate(double num1, double num2); //각 enum이 가질 operate 함수

}
