package ch.hesge.cours634.counter;


public class Counter implements ICounter {
    private int value;

    public Counter(){
        this.value = 0;
    }
    @Override
    public void inc() throws CounterException {
        value++;
    }

    @Override
    public void add(int step) throws CounterException {
        value += step;
    }

    @Override
    public int getValue() {
        return value;
    }
}
