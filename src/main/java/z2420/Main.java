package z2420;

import java.io.BufferedInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int k;
        while((k = in.nextInt()) != -1){
            process(k);
        }
    }

    private static void process(int day) {
        GregorianCalendar date = new GregorianCalendar(2000,0,1);
        date.add(Calendar.DAY_OF_MONTH, day);
        System.out.print(format.format(date.getTime()));
        System.out.println(" " + getDayOfWeek(date));
    }

    private static String getDayOfWeek(GregorianCalendar date) {
        String res = "";
        switch (date.get(Calendar.DAY_OF_WEEK) - 1){
            case 0:
                res = "Sunday";
                break;
            case 1:
                res = "Monday";
                break;
            case 2:
                res = "Tuesday";
                break;
            case 3:
                res = "Wednesday";
                break;
            case 4:
                res = "Thursday";
                break;
            case 5:
                res = "Friday";
                break;
            case 6:
                res = "Saturday";
                break;
        }
        return res;
    }
}