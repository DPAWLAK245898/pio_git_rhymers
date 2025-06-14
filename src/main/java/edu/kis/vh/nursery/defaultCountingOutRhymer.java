package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int TOTAL_BASE_VALUE = -1;

    private final int[] numbers = new int[NUMBERS_SIZE];

    private int total = TOTAL_BASE_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_BASE_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_BASE_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_BASE_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
