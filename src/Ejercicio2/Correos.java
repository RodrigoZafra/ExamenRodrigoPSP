package Ejercicio2;

import java.util.HashMap;

public class Correos {
    HashMap<String, Integer> cartas;

    public Correos() {
        cartas = new HashMap();
        cartas.put("Buzon1", 0);
        cartas.put("Buzon2", 0);
        cartas.put("Buzon3", 0);
        cartas.put("Buzon4", 0);
        cartas.put("Buzon5", 0);
    }

    public synchronized void get(String marca, String nombre) {
        while (cartas.get(marca) == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("El " + nombre + " abre el buzón " + marca + " y coge " + cartas.get(marca));
        cartas.replace(marca, cartas.get(marca) - cartas.get(marca));
        System.out.println(cartas);
        notifyAll();
    }

    public synchronized void put(String marca) {
        while (cartas.get(marca) == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        cartas.replace(marca, cartas.get(marca) + 1);
        System.out.println("Deja " + cartas.get(marca) + " cartas");
        System.out.println(cartas);
        notifyAll();
    }
}
