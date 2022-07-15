package lesson5;

import java.util.Arrays;

public class Multithreading {
    public static void main(String[] args) {
        Multithreading multithreading = new Multithreading();
        multithreading.firstArr();
        multithreading.secondArr();
    }
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public float calculation(float arr[] ,int i) {
        arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        return arr[i];
    }

    public void firstArr() {
        Arrays.fill(arr, 1);
        long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i = 0; i < arr.length; i++) {
            calculation(arr,i);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop);
        System.out.println("First time: " + (stop-start));
    }
    public void secondArr(){
        Arrays.fill(arr, 1);
        long start = System.currentTimeMillis();
        System.out.println(start);
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Runnable task = () -> {
            for (int i = 0; i < a1.length; i++) {
                calculation(a1,i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < a2.length; i++) {
                calculation(a2,i);
            }
        };
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task2);
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long stop = System.currentTimeMillis();
        System.out.println(stop);
        System.out.println("Second time: " + (stop-start));
    }

}
