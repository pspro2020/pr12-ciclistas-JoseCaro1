package ejercicio12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OpenedBarrierStageTwo implements Runnable {

    private final DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        System.out.printf("%s - De vuelta a casa,(ejecutado en %s)\n",
                LocalTime.now().format(dateTimeFormatter), Thread.currentThread().getName());
    }
}
