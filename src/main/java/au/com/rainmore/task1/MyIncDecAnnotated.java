package au.com.rainmore.task1;

import au.com.rainmore.task1.solution2.LogExecutionTime;

public class MyIncDecAnnotated implements IncDec {

    private int x;

    public MyIncDecAnnotated(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @LogExecutionTime(name = "increment")
    @Override
    public void increment() {
        this.x++;
    }

    @LogExecutionTime
    @Override
    public void decrement() {
        this.x--;
    }
}
