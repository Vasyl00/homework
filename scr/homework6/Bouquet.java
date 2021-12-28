package homework6;

import java.util.Random;

public class Bouquet {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size = rnd.nextInt(10) + 1;
        int totalCost = 0;
        System.out.println("crated bouquet with " + size + " flowers");
        for (int i = 0; i < size; i++) {
            Flower flower = takeFlower(rnd.nextInt(3));
            totalCost = totalCost + flower.getPrice();
            System.out.println(flower.getName() + " (price=" + flower.getPrice() + ")");
        }

        System.out.println("total cost=" + totalCost);

    }

    public static Flower takeFlower(int i) {
        Flower flower = null;
        switch (i) {
            case 0:
                flower = new Flower(20, "Tulip");
                break;
            case 1:
                flower = new Flower(45, "Rose");
                break;
            case 2:
                flower = new Flower(15, "chamomile");
                break;
            case 3:
                flower = new Flower(25, "carnation");
                break;
        }


        return flower;
    }


}
