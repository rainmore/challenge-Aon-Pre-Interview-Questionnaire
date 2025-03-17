package au.com.rainmore.task1.solution1;

import au.com.rainmore.task1.IncDec;

public class Solution1 {

    private final IncDec incDec;

    public Solution1(IncDec incDec) {
        this.incDec = incDec;
    }

    public void doIncrease() {
        Timer.logExecutionTime(this.incDec::increment);
    }

    public void doDecrement() {
        Timer.logExecutionTime(this.incDec::decrement);
    }
}
