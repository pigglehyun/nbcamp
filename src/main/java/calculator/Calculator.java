package calculator;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Calculator {

    private Queue<Double> list;


    public Calculator() {
        list = new LinkedList<>();
    }

    public void removeResult() {
        list.poll();
    }

    public void inquiryResults() {
        for (double l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public Queue<Double> getList() {
        return list;
    }

    public void setList(Queue<Double> list) {
        this.list = list;
    }

}