package Ejercicio1;

public class HiloImpar implements Runnable {
    int[] array;
    Thread t;

    public HiloImpar(int[] array) {
        this.array = array;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                suma = array[i] += array[i];
            }
        }
        System.out.println(suma);
    }
}
