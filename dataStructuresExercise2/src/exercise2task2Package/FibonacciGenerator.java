package exercise2task2Package;

import java.util.Iterator;

public class FibonacciGenerator implements Iterator<Integer> {
	private int val1 = 0;
    private int val2 = 1;
    private int next;

    public FibonacciGenerator() {

    }
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        next = val1 + val2;
        val1 = val2;
        val2 = next;
        return val1;
    }
}
