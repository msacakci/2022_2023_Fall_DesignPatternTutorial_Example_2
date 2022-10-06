import java.util.Date;

public class TimestampLogger extends LoggerDecorator{
    TimestampLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        message = addTimestamp(message);
        super.log(message);
    }

    public String addTimestamp(String message) {
        String timeStamp = new Date().toString();
        return timeStamp + " - " + message;
    }
}