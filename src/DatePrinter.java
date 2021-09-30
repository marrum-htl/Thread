import java.util.Date;

public class DatePrinter implements Runnable {
    int counter = 0;
    Date date = new Date();

    public DatePrinter() {
        date = new Date();
    }

    @Override
    public void run() {
        while (counter < 20) {
            System.out.println(date);
            counter++;
        }
    }
}
