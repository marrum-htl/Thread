public class Main {
    public static void main(String[] args) {
        System.out.println("**Start**");

        DatePrinter dp1 = new DatePrinter();
        Thread th1 = new Thread(dp1);

        CountPrinter cp1 = new CountPrinter();
        Thread th2 = new Thread(cp1);

        th1.start();
        th2.start();

        /**
         * Beschreibung:
         * Die Klasse DatePrinter soll 20x die aktuelle Uhrzeit (+Datum) in der Konsole ausgeben.
         * Die Klasse CountPrinter soll bis 20 hochzählen und die Werte in der Konsole ausgeben.
         *
         * Was fällt auf?
         * Der zweite Thread (th2) wird zuerst ausgegeben, obwohl der Thread 1 zuerst aufgerufen wird.
         * Möglicherweise liegt dies daran, dass die Zahlen schneller bearbeitet werden, als die der Daten (da vielleicht erst TimeStamps gesetzt werden).
         *
         * Durchläufe erhöhen:
         * Auch bei 2000 Durchläufe werden zuerst die Zahlen von 1-2000 ausgegeben, bevor die Daten beginnen.
         **/
    }
}
