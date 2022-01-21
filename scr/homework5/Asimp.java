package homework5;

import java.util.Random;
import java.util.Scanner;

public class Asimp {

    public static void main(String[] args) {
        int n = 0;
        long time = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("input array length");
        n = sc.nextInt();
        int[] arr = new int[n];
        insert(arr, n);
        int[] arrCopy = arr.clone();
        //print(arr, n);


        find(arr, n, 9);
        System.out.print("for " + n + " elements simple search time=");
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();

        sort(arr, n);
        System.out.print("for " + n + " elements simple sort time=");
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();

        doubleFind(arr, n, 9);
        System.out.print("for " + n + " elements binary search time=");
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();

        insSort(arrCopy, n);
        System.out.print("for " + n + " elements insertion sort time=");
        System.out.println(System.currentTimeMillis() - time);

    }

    public static void insert(int[] arr, int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(1000);
        }
    }


    public static void print(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");


        }
    }

    public static void find(int[] arr, int n, int need) {

        for (int i = 0; i < n; i++) {

            if (arr[i] == need) {
                //System.out.println(arr[i] + "(" + i + ")");
                break;

            }

        }
    }

    public static void doubleFind(int[] arr, int n, int need) {
        int i = n / 2 - 1;
        int diap = n / 4;
        while (arr[i] != need) {
            if (diap < 0) {
                diap = 1;
            }
            if (arr[i] > need) {
                i = i - diap;
                diap = diap / 2 + 1;
            } else if (arr[i] < need) {
                i = i + diap;
                diap = diap / 2 + 1;
            }

            if (i < 0) {
                i = 0;
            }
            if (i > n) {
                i = n;
            }

        }
        //System.out.println(arr[i] + "(" + i + ")");
    }

    public static void sort(int[] arr, int n) {

        boolean isSort = true;

        while (isSort) {
            isSort = false;
            for (int i = 1; i < n; i++) {

                if (arr[i - 1] > arr[i]) {
                    isSort = true;
                    int buf = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buf;
                }

            }
        }

    }

    public static void insSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;

        }


    }
}
