package au.com.rainmore.task1;

import org.apache.commons.lang3.time.StopWatch;

import java.util.logging.Logger;

public class Solution2 {

    private final IncDec incDec;

    private static final Logger LOGGER = Logger.getLogger( Solution2.class.getName());

    public Solution2(IncDec incDec) {
        this.incDec = incDec;
    }

    public void doIncrease() {
        StopWatch stopwatch = StopWatch.createStarted();
        this.incDec.increment();
        stopwatch.stop();
        LOGGER.info("increment took %d in nano-seconds".formatted(stopwatch.getNanoTime()));
    }

    public void doDecrement() {
        StopWatch stopwatch = StopWatch.createStarted();
        this.incDec.decrement();
        stopwatch.stop();
        LOGGER.info("decrement took %d in nano-seconds".formatted(stopwatch.getNanoTime()));
    }
}
