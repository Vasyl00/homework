package ua.ithillel.task1.task3;

import ua.ithillel.task1.MtTestMethod;
import ua.ithillel.task1.MyMixer;

public class Runner {
    public void run() {
        Integer[] arrayI = {1, 3, 5, 7};
        Double[] arrayD = {2D, 4D, 6D, 8D};
        String[] arrayS = {"one", "two", "three", "four"};
        //Pr #1
        System.out.println(" quantity elements more than value  " + MtTestMethod.calcNum(arrayD, 3));
        System.out.println(" quantity elements more than value  " + MtTestMethod.calcNum(arrayI, 3));
        //Pr #2
        System.out.println(" sum elements more than value  " + MtTestMethod.calcSum(arrayD, 3));
        System.out.println(" sum elements more than value  " + MtTestMethod.calcSum(arrayI, 3));
        //Pr3
        MyMixer myMixer = new MyMixer(arrayI);
        myMixer.print();
        myMixer.shuflle();
        myMixer.print();
        MyMixer myMixer2 = new MyMixer(arrayS);
        myMixer2.print();
        myMixer2.shuflle();
        myMixer2.print();
    }
}
