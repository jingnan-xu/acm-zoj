import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    private static Set<Character> vowels = new HashSet<Character>();

    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String line;
        String[] haiku;
        int cnt1, cnt2, cnt3;
        while (true) {
            line = in.nextLine();
            if (line.equalsIgnoreCase("e/o/i")) {
                break;
            }
            haiku = line.split("/");
            cnt1 = calSyllablesFromLine(haiku[0]);
            if (cnt1 != 5) {
                System.out.println("1");
                continue;
            }
            cnt2 = calSyllablesFromLine(haiku[1]);
            if (cnt2 != 7) {
                System.out.println("2");
                continue;
            }
            cnt3 = calSyllablesFromLine(haiku[2]);
            if (cnt3 != 5) {
                System.out.println("3");
            } else {
                System.out.println("Y");
            }
        }
    }

    private static int calSyllablesFromLine(String s) {
        String[] words = s.split(" ");
        int result = 0;
        for(String word : words) {
            result += calSyllablesFromWord(word);
        }
        return result;
    }

    private static int calSyllablesFromWord(String word) {
        int length = word.length();
        int lastIndex = -1;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (vowels.contains(word.charAt(i))) {
                if (lastIndex == -1 || i > lastIndex + 1) {
                    result ++;
                }
                lastIndex = i;
            }
        }
        return result;
    }
}