package z2201;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n, x, y;
        n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            in.nextLine();
            if (x >= y) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }

    }
}