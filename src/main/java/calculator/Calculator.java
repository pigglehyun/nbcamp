package calculator;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Calculator {

    //2.1
    /**
     * 현재 나의 main 코드에는 Calculator가 1번 생성되기 때문에 static을 붙일 필요가 없다고 생각함.
     * 하지만
     * c1 = new Calculator();
     * c2 = new Calculator();
     * 이런 식으로 여러 개의 객체가 생성될 수도 있기 때문에,
     * 모든 인스턴스가 동일한 결과 리스트를 공유할 수 있도록 static 변수로 지정.
     *
     * list와 circleList는 추가, 삭제 되어야 하기 때문에 final 키워드는 적절하지 않다.
     * final을 써야 한다면 Math.PI 정도를 사용할 수 있을 듯.
     */
    private static Queue<Integer> list;
    private static Queue<Double> circleList;

    //2.6
    public Calculator() {
        list = new LinkedList<>();
        circleList = new LinkedList<>();
    }

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

    public double calculateCircleArea(int radius) {
        double result = Math.PI * radius * radius;
        circleList.add(result);
        return result;
    }

    //2.4
    public void removeResult() {
        list.poll();
    }

    //2.5
    public void inquiryResults() {
        for (int l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public void inquiryCircleResults() {
        for (double c : circleList) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    //2.3
    public Queue<Integer> getList() {
        return list;
    }

    public void setList(Queue<Integer> list) {
        this.list = list;
    }

    public Queue<Double> getCircleList() {
        return circleList;
    }

    public void setCircleList(Queue<Double> circleList) {
        this.circleList = circleList;
    }
}
