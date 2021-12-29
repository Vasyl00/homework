package homework6;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class AnimalFactory {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input : ");
        String key = in.nextLine();

        getAnimalByKey(key);


    }

    public static Animal getAnimalByKey(String key) {
        Animal animal = new Animal(key);
        switch (key) {

            case "da":
                animal = new Dog("Aramis");
                System.out.println(animal.getName());
                return animal;
            case "db":
                animal = new Dog("Black");
                System.out.println(animal.getName());
                return animal;
            case "dc":
                animal = new Dog("Spike");
                System.out.println(animal.getName());
                return animal;
            case "ca":
                animal = new Cat("Amadei");
                System.out.println(animal.getName());
                return animal;
            case "cb":
                animal = new Cat("Baksik");
                System.out.println(animal.getName());
                return animal;
            case "cc":
                animal = new Cat("Snow");
                System.out.println(animal.getName());
                return animal;
        }
        System.out.println("can't create animal");

        System.out.println("try one more time");
        String key1 = in.nextLine();
        getAnimalByKey(key1);
        return null;


    }
}
