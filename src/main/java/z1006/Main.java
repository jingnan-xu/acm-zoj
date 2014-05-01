package z1006;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    private static int k, length;
    private static String ciphertext;
    private static char[] plaintext = new char[100];
    private static int[] plaincode = new int[100], ciphercode = new int[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        while (in.hasNextInt()) {
            k = in.nextInt();
            if (k == 0) break;
            ciphertext = in.nextLine().substring(1);
            length = ciphertext.length();
            ciphertext2ciphercode(ciphertext);
            ciphercode2plaincode();
            plaincode2plaintext();
            System.out.println(new String(plaintext, 0, length));
        }
    }

    private static void plaincode2plaintext() {
        int v;
        for (int i = 0; i < length; i++) {
            v = plaincode[i];
            if (v == 0) {
                plaintext[i] = '_';
            } else if (v == 27) {
                plaintext[i] = '.';
            } else {
                plaintext[i] = (char) ('a' + v - 1);
            }
        }
    }

    private static void ciphercode2plaincode() {
        for (int i = 0; i < length; i++) {
            plaincode[(k * i) % length] = (ciphercode[i] + i) % 28;
        }
    }

    private static void ciphertext2ciphercode(String ciphertext) {
        char c;
        for (int i = 0; i < length; i++) {
            c = ciphertext.charAt(i);
            if (c >= 'a' && c <= 'z') {
               ciphercode[i] = ciphertext.charAt(i) - 'a' + 1;
            } else if (c == '_'){
               ciphercode[i] = 0;
            } else {
                ciphercode[i] = 27;
            }
        }
    }


}
