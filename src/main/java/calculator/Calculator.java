package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    //2.1
    private Queue<Integer> list = new LinkedList<>();

    public int calculate(int num1, int num2, char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new IllegalArgumentException();
        }
        int result = 0;
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
        list.add(result);
        return result;
    }

    //2.4
    public void removeResult(){
        list.poll();
    }
    
    //2.3
    public Queue<Integer> getList() {
        return list;
    }

    public void setResult(Queue<Integer> list) {
        this.list = list;
    }
}
