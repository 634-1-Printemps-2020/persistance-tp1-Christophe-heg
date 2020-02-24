package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) {
        try {

            System.out.println("Counter");
            Counter c = new Counter();

            System.out.println(c.getValue());
            c.inc();
            System.out.println(c.getValue());
            c.add(10);
            System.out.println(c.getValue());
            c.add(-5);
            System.out.println(c.getValue());

            System.out.println("Limited counter");
            UpperLimitedPositiveCounter uc = new UpperLimitedPositiveCounter(10);

            uc.add(5);
            System.out.println(uc.getValue());
            uc.inc();
            uc.add(-3);
            System.out.println(uc.getValue());
            uc.add(6);
            System.out.println(uc.getValue());

        } catch (CounterException c){
            System.out.println(c.getMessage());
        }

    }
}
