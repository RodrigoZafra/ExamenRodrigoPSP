package Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array: ");
        int[] numeros = new int[sc.nextInt()];
        sc.close();
        Random random = new Random();
        System.out.println("Rellenando aleatorios...");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000) + 1;
        }
        HiloImpar hiloIm = new HiloImpar(numeros);
        HiloPar hiloPa = new HiloPar(numeros);
        hiloPa.start();

    }
}
