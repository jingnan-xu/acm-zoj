import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        String ip;
        n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            ip = in.nextLine();
            convert(ip);
        }
    }

    private static void convert(String ip) {
        int total;
        for (int i = 0; i < 4; i++) {
            total = 0;
            for (int j = 7, k = 1; j >= 0; j--, k *= 2) {
                total += ip.charAt(i * 8 + j) == '1' ? k : 0;
            }
            if (i > 0) {
                System.out.print(".");
            }
            System.out.print(total);
        }
        System.out.println();
    }
}