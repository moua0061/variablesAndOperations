import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements Interface {

    private BufferedWriter writer;

    // constructor
    public FileLogger() {
        try {
            writer = new BufferedWriter(new FileWriter("logs.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void info(String info) {
        Date date = new Date();
        try {
            writer.write("info: " + date + " " + info + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void warning(String warning) {
        Date date = new Date();
        try {
            writer.write("warning: " + date + " " + warning + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void error(String error) {
        Date date = new Date();
        try {
            writer.write("error: " + date + " " + error + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fatal(String fatal) {
        Date date = new Date();
        try {
            writer.write("fatal: " + date + " " + fatal + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
