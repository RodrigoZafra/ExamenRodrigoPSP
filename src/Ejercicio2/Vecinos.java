package Ejercicio2;

import Ejercicio2.Correos;

public class Vecinos extends Thread {
    private Correos monitor;
    private String marca;
    private String nombre;

    public Vecinos(Correos monitor, String marca, String nombre) {
        this.monitor = monitor;
        this.marca = marca;
        this.nombre = nombre;
    }

    public void run() {

        while (true) {
            monitor.get(this.marca, this.nombre);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
