package z2476;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        double total;
        String value;
        while ((n = in.nextInt()) != 0) {
            in.nextLine();
            total = 0;
            for (int i = 0; i < n; i++) {
                value = in.nextLine();
                total += getValue(value);
            }
            System.out.printf("$%,.2f\n", total);
        }
    }

    private static double getValue(String value) {
        return Double.parseDouble(value.replaceAll("\\$|,", ""));
    }
}