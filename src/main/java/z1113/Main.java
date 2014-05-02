package z1113;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        double[] arr = new double[10];
        arr[0] = 1;
        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i - 1] * i;
        }
        for (int i = 0; i < 10; i++) {
            arr[i] = 1.0 / arr[i];
        }
        System.out.println("n e");
        System.out.println("- -----------");
        System.out.println("0 1\n" + "1 2\n" + "2 2.5");
        for (int i = 1; i < 10; i++) {
            arr[i] += arr[i - 1];
            if (i > 2) {
                System.out.printf("%d %#.9f\n", i, arr[i]);
            }
        }
    }
}