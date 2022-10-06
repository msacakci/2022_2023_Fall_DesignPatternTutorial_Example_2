public class LoggerDecorator implements Logger{
    private Logger logger;

    LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    public void log(String message) {
        logger.log(message);
    }
}