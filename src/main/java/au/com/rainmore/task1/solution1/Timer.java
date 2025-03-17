package au.com.rainmore.task1.solution1;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

public class Timer {

    private static final Logger LOGGER = Logger.getLogger(Timer.class.getName());

    public static void logExecutionTime(LambdaExpression lambdaExpression) {
        Instant start = java.time.Instant.now();
        lambdaExpression.call();
        Instant end = java.time.Instant.now();
        Duration duration = Duration.between(start, end);
        LOGGER.info("execution took %d in nano-seconds".formatted(duration.toNanos()));
    }
}
