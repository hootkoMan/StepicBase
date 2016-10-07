package m4_exception.Ex_4_3_logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex_4_3_8_loggerLevel {
    private static void configureLogging() {
        final Logger LOGGER_A = Logger.getLogger(org.stepic.java.logging.ClassA.class.getName());
        final Logger LOGGER_B = Logger.getLogger(org.stepic.java.logging.ClassB.class.getName());
        LOGGER_A.log(Level.ALL, "Logger A");
        LOGGER_B.log(Level.WARNING, "Logger B");

//        final Logger LOGGER_D = Logger.getLogger(org.stepic.java);

    }
}
