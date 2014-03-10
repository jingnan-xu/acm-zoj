import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a <= 168) {
            System.out.println("CRASH " + a);
        } else if (b <= 168) {
            System.out.println("CRASH " + b);
        } else if (c <= 168) {
            System.out.println("CRASH " + c);
        } else {
            System.out.println("NO CRASH");
        }
    }
}