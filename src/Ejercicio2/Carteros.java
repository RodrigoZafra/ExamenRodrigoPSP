package Ejercicio2;

import java.util.ArrayList;

public class Carteros extends Thread {
    private Correos monitor;
    private ArrayList<String> vecinos;

    public Carteros(Correos monitor) {
        this.monitor = monitor;
        vecinos = new ArrayList<String>();
        vecinos.add("Buzon1");
        vecinos.add("Buzon2");
        vecinos.add("Buzon3");
        vecinos.add("Buzon4");
        vecinos.add("Buzon5");
    }

    public void run() {
        int num;
        while (true) {
            num = (int) (Math.random() * 5);
            monitor.put(vecinos.get(num));
            try {
                sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}
