import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n, m, x1, y1, x2, y2, x, y;
        ArrayList<Point> points = new ArrayList<Point>();
        while ((n = in.nextInt()) != 0) {
            in.nextLine();
            points.clear();
            for (int i = 0; i < n; i++) {
                x1 = in.nextInt();
                y1 = in.nextInt();
                x2 = in.nextInt();
                y2 = in.nextInt();
                in.nextLine();
                points.add(new Point(x1, y1, x2, y2));
            }
            m = in.nextInt();
            in.nextLine();
            for (int i = 0; i < m; i++) {
                x = in.nextInt();
                y = in.nextInt();
                in.nextLine();
                judge(points, x, y);
            }
        }
    }

    private static void judge(ArrayList<Point> points, int x, int y) {
        for (int i = points.size() - 1; i >= 0; i--) {
            if (points.get(i).isInside(x, y)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

    static class Point {

        private int x1, y1, x2, y2;

        public Point(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public boolean isInside(int x, int y) {
            return x1 <= x && x <= x2 && y1 <= y && y <= y2 ? true : false;
        }
    }
}