import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        int n, x, y, base;
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        n = in.nextInt();
        while (n > 0) {
            n--;
            x = in.nextInt();
            y = in.nextInt();
            base = minEven(x, y);
            cal(base, x, y);
        }
    }

    private static void cal(int base, int x, int y) {
        int result = 4 * (base / 2);
        if (base == x && base == y) {
            System.out.println(result);
            return ;
        }

        if (base + 1 == x && base + 1 == y) {
            System.out.println(result + 1);
        } else if (base + 2 == x && base == y) {
            System.out.println(result + 2);
        } else if (base + 3 == x && base + 1 == y) {
            System.out.println(result + 3);
        } else {
            System.out.println("No Number");
        }
    }

    private static int minEven(int x, int y) {
        int a = x > y ? y : x;
        if (a % 2 == 0) {
            return a;
        } else {
            return a - 1;
        }
    }
}
