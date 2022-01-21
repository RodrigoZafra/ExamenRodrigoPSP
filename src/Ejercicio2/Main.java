package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del hilo principal");

        Correos monitor = new Correos();
        Carteros f = new Carteros(monitor);
        Vecinos comp1 = new Vecinos(monitor, "Buzon1", "Vecino 1");
        Vecinos comp2 = new Vecinos(monitor, "Buzon2", "Vecino 2");
        Vecinos comp3 = new Vecinos(monitor, "Buzon3", "Vecino 3");
        Vecinos comp4 = new Vecinos(monitor, "Buzon4", "Vecino 4");
        Vecinos comp5 = new Vecinos(monitor, "Buzon5", "Vecino 5");
        f.start();
        comp1.start();
        comp2.start();
        comp3.start();
        comp4.start();
        comp5.start();

        System.out.println("Fin del hilo principal");
    }

}

