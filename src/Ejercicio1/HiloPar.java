package Ejercicio1;

public class HiloPar extends Thread {
    int[] array;

    public HiloPar(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                suma = array[i] += array[i];
            }
        }
        System.out.println(suma);
    }
}
