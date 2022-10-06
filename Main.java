public class Main {
    public static void main(String[] args) {
        String message = "Hello world";

        Logger rawLogger = new ConsoleLogger();
        rawLogger.log(message); // Hello world

        Logger decoratedLogger_1 = new TimestampLogger(rawLogger);
        decoratedLogger_1.log(message); // Thu Oct 06 18:12:24 TRT 2022 - Hello world

        Logger decoratedLogger_2 = new EncryptionLogger(rawLogger);
        decoratedLogger_2.log(message); // Jgnnq yqtnf

        Logger decoratedLogger_3 = new TimestampLogger(new EncryptionLogger(rawLogger));
        decoratedLogger_3.log(message); // Vjw Qev LR MTVMNVNP VTV NLNN I Jgnnq yqtnf

        Logger decoratedLogger_4 = new EncryptionLogger(new TimestampLogger(rawLogger));
        decoratedLogger_4.log(message); // Thu Oct 06 18:12:24 TRT 2022 - Jgnnq yqtnf
    }
}