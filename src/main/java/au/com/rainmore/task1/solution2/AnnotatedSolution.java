package au.com.rainmore.task1.solution2;

import au.com.rainmore.task1.solution1.Solution2;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

public class AnnotatedSolution {

    private static final Logger LOGGER = Logger.getLogger(AnnotatedSolution.class.getName());

    private void initializeObject(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                String methodName = method.getName() ;
                if (annotation != null && StringUtils.isNotBlank(annotation.name())) {
                    methodName = annotation.name();
                }

                Instant start = java.time.Instant.now();
                method.invoke(object);
                Instant end = java.time.Instant.now();
                Duration duration = Duration.between(start, end);
                LOGGER.info("method \"%s\" execution took %d in nano-seconds".formatted(duration.toNanos()));
            }
        }
    }
}
