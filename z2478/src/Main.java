import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {
    private static int[] counts = new int[30];

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n = in.nextInt();
        in.nextLine();
        String line;
        for (int i = 0; i < n; i++) {
            line = in.nextLine();
            process(line);
        }
    }

    private static void process(String line) {
        for(int i = 0; i < 30; i++) {
            counts[i] = 0;
        }
        counts[line.charAt(0) - 'A'] = 1;
        char a = 0, b;
        for(int i = 1; i < line.length(); i++) {
            a = line.charAt(i);
            b = line.charAt(i - 1);
            if (a != b) {
                if (counts[b - 'A'] > 1) {
                    System.out.print(counts[b - 'A']);
                }
                System.out.print(b);
                counts[b - 'A'] = 0;
                counts[a - 'A'] = 1;
            } else {
                counts[a - 'A']++;
            }
        }
        if (counts[a - 'A'] > 1){
            System.out.print(counts[a - 'A']);
        }
        System.out.println(a);
    }
}