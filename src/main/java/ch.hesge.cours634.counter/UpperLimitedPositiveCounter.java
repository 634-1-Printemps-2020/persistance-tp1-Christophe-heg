package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int value;
    private int max;

    public UpperLimitedPositiveCounter(int max) throws CounterException{
        this.value = 0;
        this.max = max;

    }
    @Override
    public void inc() throws CounterException {
        if (value >= max){
            throw new CounterException();
        }
        else{
            value++;
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if ((value+step) > max || (value+ step) < 0){
            throw new CounterException();
        }
        else {
            value+= step;
        }
    }

    @Override
    public int getValue() {
        return value;
    }
}
