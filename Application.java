public class Application {

    public static void main(String[] args) {
        Interface logger = new ConsoleLogger();
        logger.info("hello");
        logger.warning("this is a warning");
        logger.error("this is an error");
        logger.fatal("this is fatal");
    }
}
