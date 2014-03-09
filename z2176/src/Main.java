import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n;
        ArrayList<Integer> speeds = new ArrayList<Integer>();
        ArrayList<Integer> hours = new ArrayList<Integer>();
        int totalMiles;
        while ((n = in.nextInt()) != -1) {
            totalMiles = 0;
            in.nextLine();
            speeds.clear();
            hours.clear();
            for (int i = 0; i < n; i++) {
                speeds.add(in.nextInt());
                hours.add(in.nextInt());
                in.nextLine();
            }
            for (int i = n -1; i > 0; i--) {
                hours.set(i, hours.get(i) - hours.get(i - 1));
                totalMiles += hours.get(i) * speeds.get(i);
            }
            totalMiles += hours.get(0) * speeds.get(0);
            System.out.println(totalMiles + " miles");
        }
    }
}