package m4_exception.Ex_4_3_logger;

import m4_exception.Ex_4_2_7.RobotConnectionException;

import java.io.IOException;
import java.util.logging.*;

public class Ex_4_3_logger {
    private static final Logger LOGGER = Logger.getLogger(Ex_4_3_logger.class.getName());

    public static void main(String[] args) throws IOException {
        Exception e = new RobotConnectionException("Ups");

        LOGGER.log(Level.INFO, "I'm logging");

        LOGGER.warning("Houston, we have a problem...");

        LOGGER.log(Level.FINEST, "String" + "someVariable");
        LOGGER.log(Level.FINER, "String {0}", args[0]); //insert variable, you can do localization
        LOGGER.log(Level.FINE, "String {0}, {1}", new Object[]{args[0], args[1]});
        LOGGER.log(Level.WARNING, "Unexpected exception", e);

        //Наследники Handler
        LOGGER.addHandler(new ConsoleHandler());
        LOGGER.addHandler(new FileHandler());
        LOGGER.addHandler(new SocketHandler());

        //Форматирования логов
        SimpleFormatter simpleFormatter;
        XMLFormatter xmlFormatter;

    }
}
