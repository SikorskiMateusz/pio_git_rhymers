package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TAB_SIZE = 12;
    private static final int TOTAL = -1;

    private final int[] numbers = new int[TAB_SIZE];

    private int total = TOTAL;

    public int getTotal() { return total; }

    public void setTotal(int t) { total = t; }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return numbers[total--];
    }
}
