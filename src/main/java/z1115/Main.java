package z1115;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        String str;
        while (!(str = in.nextLine()).equalsIgnoreCase("0")) {
            n = 0;
            for (int i = 0; i < str.length(); i++) {
                n += str.charAt(i) - '0';
            }
            n %= 9;
            if (n == 0) n = 9;
            System.out.println(n);
        }
    }


}