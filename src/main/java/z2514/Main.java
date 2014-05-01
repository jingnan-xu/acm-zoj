package z2514;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    private static int total;
    private static HashMap<Character, Character> ss = new HashMap<Character, Character>();
    private static boolean[] flags = new boolean[1100];

    static {
        ss.put('1', '@');
        ss.put('0', '%');
        ss.put('l', 'L');
        ss.put('O', 'o');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        while ((n = in.nextInt()) != 0) {
            in.nextLine();
            names.clear();
            passwords.clear();
            total = 0;
            for (int i = 0; i < 1100; i++) {
                flags[i] = false;
            }
            for (int i = 0; i < n; i++) {
                names.add(in.next());
                passwords.add(process(in.next(), i));
                in.nextLine();
            }
            if (total == 0) {
                System.out.println("No account is modified.");
            } else {
                System.out.println(total);
                for (int i = 0; i < n; i++) {
                    if (flags[i]) {
                        System.out.println(names.get(i) + " " + passwords.get(i));
                    }
                }
            }
        }
    }

    private static String process(String password, int index) {
        StringBuffer sb = new StringBuffer();
        boolean flag =  false;
        for (int i = 0; i < password.length(); i++) {
            if (ss.containsKey(password.charAt(i))) {
                sb.append(ss.get(password.charAt(i)));
                flag = true;
            } else {
                sb.append(password.charAt(i));
            }
        }
        if (flag) {
            total++;
            flags[index] = true;
            return sb.toString();
        } else {
            return null;
        }
    }
}