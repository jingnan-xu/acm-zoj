package z2421;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {
    private static int[] counts = new int[500001];
    private static HashSet<Integer> data = new HashSet<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        process();
        int k;
        while((k = in.nextInt()) != -1){
            System.out.println(counts[k]);
        }
    }

    private static void process() {
        counts[0] = 0;
        int temp;
        for (int i = 1; i < 500001; i++) {
            temp = counts[i - 1] - i;
            if (temp > 0 && !data.contains(temp)) {
                counts[i] = temp;
                data.add(temp);
            } else {
                temp = counts[i - 1] + i;
                counts[i] = temp;
                data.add(temp);
            }
        }
    }
}