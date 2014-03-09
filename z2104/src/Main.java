import java.io.BufferedInputStream;
import java.util.*;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        String word = "";
        HashMap<String, Integer> mm = new HashMap<String, Integer>();
        while ((n = in.nextInt()) != 0) {
            mm.clear();
            in.nextLine();
            for (int i = 0; i < n; i++) {
                word = in.nextLine();
                if (mm.containsKey(word)) {
                    mm.put(word, mm.get(word) + 1);
                } else {
                    mm.put(word, 1);
                }
            }
            int max = -1;
            for (Map.Entry<String, Integer> entry : mm.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    word = entry.getKey();
                }
            }
            System.out.println(word);
        }
    }
}