package au.com.rainmore.task1.solution1;

import au.com.rainmore.task1.IncDec;
import org.apache.commons.lang3.time.StopWatch;

import java.util.logging.Logger;

/**
 * StopWatch takes longer time than using Instance/Duration
 */
public class Solution2 {

    private final IncDec incDec;

    private static final Logger LOGGER = Logger.getLogger(Solution2.class.getName());

    public Solution2(IncDec incDec) {
        this.incDec = incDec;
    }

    private void logExecutionTime(LambdaExpression lambdaExpression) {
        StopWatch stopwatch = StopWatch.createStarted();
        lambdaExpression.call();
        stopwatch.stop();
        LOGGER.info("execution took %d in nano-seconds".formatted(stopwatch.getNanoTime()));
    }

    public void doIncrease() {
        logExecutionTime(this.incDec::increment);
    }

    public void doDecrement() {
        logExecutionTime(this.incDec::decrement);
    }
}
