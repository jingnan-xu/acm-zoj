package z2481;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        ArrayList<Integer> data = new ArrayList<Integer>();
        while ((n = in.nextInt()) != 0) {
            data.clear();
            for (int i = 0; i < n; i++) {
                data.add(in.nextInt());
            }
            Collections.sort(data);
            System.out.print(data.get(0));
            for (int i = 1; i < n; i++) {
                if (data.get(i) > data.get(i-1)) {
                    System.out.print(" " + data.get(i));
                }
            }
            System.out.println();
        }
    }
}