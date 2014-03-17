import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {
    private static ArrayList<Double> speeds = new ArrayList<Double>();
    private static ArrayList<Double> weights = new ArrayList<Double>();
    private static ArrayList<Double> strengths = new ArrayList<Double>();

    static {
        speeds.add(4.5);
        speeds.add(6.0);
        speeds.add(5.0);

        weights.add(150.0);
        weights.add(300.0);
        weights.add(200.0);

        strengths.add(200.0);
        strengths.add(500.0);
        strengths.add(300.0);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        double speed, weight, strength;
        int flag;
        while (true) {
            speed = in.nextDouble();
            weight = in.nextDouble();
            strength = in.nextDouble();
            in.nextLine();
            if (speed == 0 && weight == 0 && strength == 0) {
                break;
            }
            flag = 0;
            if (speed <= speeds.get(0) && weight >= weights.get(0) && strength >= strengths.get(0)) {
                System.out.print("Wide Receiver");
                flag = 1;
            }

            if (speed <= speeds.get(1) && weight >= weights.get(1) && strength >= strengths.get(1)) {
                if (flag == 1) {
                    System.out.print(" ");
                }
                System.out.print("Lineman");
                flag = 2;
            }

            if (speed <= speeds.get(2) && weight >= weights.get(2) && strength >= strengths.get(2)) {
                if (flag > 0) {
                    System.out.print(" ");
                }
                System.out.print("Quarterback");
                flag = 3;
            }
            if (flag > 0) {
                System.out.println();
            } else {
                System.out.println("No positions");
            }
        }
    }
}