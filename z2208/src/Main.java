import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    private static char[][] message = new char[110][25];

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int columns, rows;
        String str;
        while ((columns = in.nextInt()) != 0) {
            in.nextLine();
            str = in.nextLine();
            rows = str.length() / columns;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    message[i][j] = str.charAt(i * columns + j);
                }
                if (i % 2 == 1) {
                    swap(message[i], columns);
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < columns; j++) {
                for (int i = 0; i < rows; i++) {
                    sb.append(message[i][j]);
                }
            }
            System.out.println(sb.toString());
        }

    }

    private static void swap(char[] chars, int length) {
        for (int i = 0; i < length / 2; i++) {
            char c = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = c;
        }
    }
}