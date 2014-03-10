import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n, a, b, s, d;
        n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            s = in.nextInt();
            d = in.nextInt();
            in.nextLine();
            if ((s + d) % 2 == 1 || (s - d) % 2 == 1 || s < d) {
                System.out.println("impossible");
                continue;
            }
            a = (s + d) / 2;
            b = (s - d) / 2;
            System.out.println(a + " " + b);
        }
    }
}