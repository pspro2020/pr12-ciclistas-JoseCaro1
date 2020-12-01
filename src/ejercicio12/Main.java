package ejercicio12;

import java.util.concurrent.CyclicBarrier;

public class Main {
    private static final int NUMBER_OF_CYCLIST = 10;

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER_OF_CYCLIST, new OpenedBarrier());
        CyclicBarrier cyclicBarrier2 = new CyclicBarrier(NUMBER_OF_CYCLIST, new OpenedBarrier());
        CyclicBarrier cyclicBarrier3 = new CyclicBarrier(NUMBER_OF_CYCLIST, new OpenedBarrier());

        for (int i = 0; i < NUMBER_OF_CYCLIST; i++) {
            new Thread(new Ciclistas(cyclicBarrier,cyclicBarrier2,cyclicBarrier3),"ciclista "+(i+1)).start();

        }

    }
}
