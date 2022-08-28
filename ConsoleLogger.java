import java.util.Date;

public class ConsoleLogger implements Interface {

    @Override
    public void info(String info) {
        Date date = new Date();
        System.out.println(date + " " + info);

    }

    @Override
    public void warning(String warning) {
        Date date = new Date();
        System.out.println(date + " warning: " + warning);

    }

    @Override
    public void error(String error) {
        Date date = new Date();
        System.out.println(date + " error: " + error);

    }

    @Override
    public void fatal(String fatal) {
        Date date = new Date();
        System.out.println(date + " FATAL! " + fatal.toUpperCase());

    }

}
