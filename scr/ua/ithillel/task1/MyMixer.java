package ua.ithillel.task1;


import java.util.Random;

public class MyMixer<T> {
    public T[] array;
    public T buffer;

    public MyMixer(T[] array) {
        this.array = array;
    }


    public void shuflle() {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            buffer = array[i];
            int value = rnd.nextInt(array.length - 1);
            array[i] = array[value];
            array[value] = buffer;

        }

    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
        System.out.println();
    }
}
