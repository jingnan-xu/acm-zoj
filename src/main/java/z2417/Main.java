package z2417;

import java.io.BufferedInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int k;
        while((k = in.nextInt()) != 0){
            process(k);
        }
    }

    private static void process(int num) {
        String binaryString = Integer.toBinaryString(num);
        String resBinaryString = binaryString.substring(binaryString.lastIndexOf("1"));
        System.out.println(Integer.parseInt(resBinaryString, 2));
    }
}