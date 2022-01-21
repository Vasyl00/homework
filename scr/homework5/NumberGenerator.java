package homework5;

import java.util.*;

public class NumberGenerator {

    int numberOfElements;
    int minNumber;
    int maxNumber;

    public NumberGenerator(int numberOfElements, int minNumber, int maxNumber) {
        this.numberOfElements = numberOfElements;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }


    public static void main(String[] args) {

        NumberGenerator num = new NumberGenerator(16, -5, 11);
        List<Integer> list = num.generaList();
        System.out.println(list.toString());
        Set<Integer> set = num.MyNumGenerator();
        System.out.println(set.toString());

    }

    public Set<Integer> MyNumGenerator() {
        Random rnd = new Random();
        Set<Integer> set = new HashSet<>();

        int i = 0;
        if (numberOfElements > (maxNumber - minNumber)) {
            System.out.println("there are no " + numberOfElements + " unique elements in range");
            return null;
        } else {

            while (i < numberOfElements) {
                int num = rnd.nextInt((maxNumber - minNumber)) + minNumber;
                if (!set.contains(num)) {
                    set.add(num);
                    i++;
                }
            }
        }

        return set;

    }

    public List<Integer> generaList() {
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(rnd.nextInt((maxNumber - minNumber)) + minNumber);
        }
        return list;

    }
}
