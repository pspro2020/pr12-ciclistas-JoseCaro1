package ejercicio12;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class OpenedBarrier implements Runnable {
    private int count;
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        switch (count) {

            case 0:
                System.out.printf("%s - %s :Comienza la etapa\n", LocalDateTime.now().format(formatter), Thread.currentThread().getName());
                break;
            case 1:
                System.out.printf("%s - %s :De vuelta a casa\n", LocalDateTime.now().format(formatter), Thread.currentThread().getName());
                break;
            case 2:
                System.out.printf("%s - %s : Etapa finalizada\n", LocalDateTime.now().format(formatter), Thread.currentThread().getName());
                break;
            default:
                System.out.println("Error");
        }
        count++;
    }

}
