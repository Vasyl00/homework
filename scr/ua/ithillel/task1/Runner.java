package ua.ithillel.task1;

public class Runner {
    public void run() {

        Integer[] arrayI = {1, 3, 5, 7};
        Double[] arrayD = {2D, 4D, 6D, 8D};


        System.out.println(MtTestMethod.calcNum(arrayD, 3));
        System.out.println(MtTestMethod.calcNum(arrayI, 3));

        System.out.println(MtTestMethod.calcSum(arrayD, 3));
        System.out.println(MtTestMethod.calcSum(arrayI, 3));

    }
}
