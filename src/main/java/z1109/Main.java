package z1109;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String line;
        while (!(line = in.nextLine()).equalsIgnoreCase("")) {
            String[] words = line.split(" ");
            dictionary.put(words[1], words[0]);
        }
        while (in.hasNext()) {
            line = in.nextLine();
            if (dictionary.containsKey(line)) {
                System.out.println(dictionary.get(line));
            } else {
                System.out.println("eh");
            }
        }
    }
}