import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        String str10, str12, str16;
        int a, b, c;
        for (int i = 2991; i < 10000; i++) {
            str10 = Integer.toString(i, 10);
            str12 = Integer.toString(i, 12);
            str16 = Integer.toString(i, 16);
            a = sum(str10);
            b = sum(str12);
            c = sum(str16);
            if (a == b && b == c) {
                System.out.println(i);
            }
        }
    }

    private static int sum(String str) {
        int res = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c <= '9') {
                res += c - '0';
            } else {
                res += c - 'a' + 10;
            }
        }
        return res;
    }
}

