package ejercicio12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OpenedBarrierStageThree  implements Runnable{

    private final DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        System.out.printf("%s - Etapa finalizada,(ejecutado en %s)\n",
                LocalTime.now().format(dateTimeFormatter), Thread.currentThread().getName());
    }
}
