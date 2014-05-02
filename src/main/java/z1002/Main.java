package z1002;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-5-2.
 */
public class Main {
    private static int n;
    private static int max;
    private static int[][] map = new int[10][10];

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String line;
        while ((n = in.nextInt()) != 0) {
            in.nextLine();
            max = 0;
            for (int i = 0; i < n; i++) {
                line = in.nextLine();
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == '.') {
                        map[i][j] = 0;
                    } else {
                        map[i][j] = -1;
                    }
                }
            }
            search(0);
            System.out.println(max);
        }
    }

    private static void search(int i) {
        if (i == n * n) {
            int num = cal();
            if (num > max) {
                max = num;
            }
            return;
        }

        int row = i / n;
        int col = i % n;
        if (map[row][col] == 0 && ok(row, col)) {
            map[row][col] = 1;
            search(i + 1);
            map[row][col] = 0;
        }
        search(i + 1);
    }

    private static boolean ok(int row, int col) {
        int i;
        for (i = col -1; i >= 0; i--) {
            if (map[row][i] == 0) {
                continue;
            } else if (map[row][i] == -1) {
                break;
            } else {
                return false;
            }
        }

        for (i = row -1; i >= 0; i--) {
            if (map[i][col] == 0) {
                continue;
            } else if (map[i][col] == -1) {
                break;
            } else {
                return false;
            }
        }

        return true;
    }

    private static int cal() {
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    res ++;
                }
            }
        }
        return res;
    }
}