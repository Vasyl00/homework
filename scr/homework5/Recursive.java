package homework5;

import java.util.Arrays;

public class Recursive {
    public static void main(String[] args) {
        int[] a = {8, 2, 6, 9, 5, 10, 15};
        int maximum = Integer.MIN_VALUE;
        int suma = sum(a, a.length - 1);
        System.out.println("suma = " + suma);
        System.out.println("max = " + max(a, a.length - 1, 0));
        int num = 34567;
        System.out.println("sum digits= " + sumDigits(num));
        System.out.println("reverse digits " + reverseDigits(num));

    }

    public static int sum(int[] a, int i) {

        if (i == 0) {
            return a[0];
        } else {
            return a[i] + sum(a, --i);
        }
    }

    public static int max(int[] a, int i, int m) {

        if (i == 0 && a[0] > m) {
            return a[i];
        }
        if (i == 0 && a[0] < m) {
            return m;
        }

        if (a[i] > m) {
            return max(a, (i - 1), a[i]);
        } else {
            return max(a, --i, m);
        }

    }

    public static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumDigits((num - num % 10) / 10);
    }

    public static String reverseDigits(int num) {
        if (num == 0) {
            return "";
        }
        return "" + num % 10 + reverseDigits((num - num % 10) / 10);
    }

}
