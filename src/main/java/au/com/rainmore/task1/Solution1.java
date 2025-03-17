package au.com.rainmore.task1;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

public class Solution1 {

    private final IncDec incDec;

    private static final Logger LOGGER = Logger.getLogger( Solution1.class.getName());

    public Solution1(IncDec incDec) {
        this.incDec = incDec;
    }

    public void doIncrease() {
        Instant start = java.time.Instant.now();
        this.incDec.increment();
        Instant end = java.time.Instant.now();
        LOGGER.info("increment took %s".formatted(Duration.between(start, end)));
    }

    public void doDecrement() {
        Instant start = java.time.Instant.now();
        this.incDec.decrement();
        Instant end = java.time.Instant.now();
        LOGGER.info("increment took %s".formatted(Duration.between(start, end)));
    }
}
