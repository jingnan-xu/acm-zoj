package z1005;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xjn on 14-5-2.
 */
public class Main {

    private static int ca, cb, n;
    private static ArrayList<Integer> steps = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        while (in.hasNext()) {
            ca = in.nextInt();
            cb = in.nextInt();
            n = in.nextInt();
            in.nextLine();
            search();
            print();
        }

    }

    private static void print() {
        for (int i = 0; i < steps.size(); i++) {
            switch (steps.get(i)) {
                case 2:
                    System.out.println("fill B");
                    break;
                case 3:
                    System.out.println("empty A");
                    break;
                case 6:
                    System.out.println("pour B A");
                    break;
            }
        }
        System.out.println("success");
    }

    private static void search() {
        steps.clear();
        int a, b;
        a = b = 0;
        while (b != n) {
            if (b == 0) {
                b = cb;
                steps.add(2);
            } else if (a == ca) {
                a = 0;
                steps.add(3);
            } else {
                int min = (ca - a) > b ? b : (ca -a);
                b -= min;
                a += min;
                steps.add(6);
            }
        }
    }
}
