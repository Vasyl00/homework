package homework5;

import java.util.ArrayList;

public class RecursiveFive {
    static String res;
    static String result = "1";
    static ArrayList<Integer> list;

    public static void main(String[] args) {
        int number = 112;
        int res = number;
        list = new ArrayList<>();
        five(number);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 3) {
                result = result + "*3";
            } else {
                result = result + "+5";
            }
        }
        System.out.println(number + " = " + result);

    }

    private static int three(int num) {
        if (num % 3 == 0) {
            num = num / 3;
            list.add(3);
            return three(num);
        } else {
            return num;
        }


    }

    private static int five(int num) {

        if (num % 3 == 0 && num != 6) {
            num = three(num);
        }
        if (num - 5 > 1 || num - 5 == 1) {
            num = num - 5;
            list.add(5);
            return five(num);
        } else if (num == 1) {
            return num;
        } else {
            System.out.println("can not be found");
            return num;
        }


    }
}