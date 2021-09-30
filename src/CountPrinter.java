public class CountPrinter implements Runnable {
    int counter = 1;

    @Override
    public void run() {
        while (counter <= 20) {
            System.out.println(counter);
            counter++;
        }
    }
}
