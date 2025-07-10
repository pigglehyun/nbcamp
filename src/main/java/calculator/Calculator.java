package calculator;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Calculator<T extends Number> {

    private Queue<T> list;


    public Calculator() {
        list = new LinkedList<>();
    }

    public void removeResult() {
        list.poll();
    }

    public void inquiryResults() {
        for (T l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public Queue<T> getList() {
        return list;
    }

    public void setList(Queue<T> list) {
        this.list = list;
    }

}