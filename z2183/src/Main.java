import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by xjn on 14-2-25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int n, distance, deadline;
        ArrayList<Point> points = new ArrayList<Point>();
        while(in.hasNext()) {
            n = in.nextInt();
            in.nextLine();
            points.clear();
            for (int i = 0; i < n; i++) {
                distance = in.nextInt();
                deadline = in.nextInt();
                points.add(new Point(distance, deadline));
                in.nextLine();
            }

            Collections.sort(points, new Comparator<Point>() {
                @Override
                public int compare(Point o1, Point o2) {
                    if (o1.getDeadline() == o2.getDeadline()) {
                        return 0;
                    } else {
                        return o1.getDeadline() - o2.getDeadline();
                    }
                }
            });

            points.get(0).setDeadline(0);
            int leftTime;
            for (int i = 1; i < n; i++) {
                if (points.get(i).getDistance() <points.get(i -1).getDistance()) {
                    points.get(i).setDeadline(points.get(i - 1).getDeadline());
                    points.get(i).setDistance(points.get(i - 1).getDistance());
                    continue;
                }
                distance = Math.abs(points.get(i).getDistance() - points.get(i-1).getDistance());
                leftTime = Math.abs(points.get(i).getDeadline() - points.get(i-1).getDeadline());
                if (distance <= leftTime) {
                    points.get(i).setDeadline(points.get(i-1).getDeadline() + distance);
                } else {
                    System.out.println("No solution");
                }
            }
            System.out.println(points.get(n-1).getDeadline());
        }
    }

    static class Point{
        private int distance;
        private int deadline;

        public Point(int distance, int deadline) {
            this.distance = distance;
            this.deadline = deadline;
        }

        public int getDistance() {
            return distance;
        }

        public int getDeadline() {
            return deadline;
        }

        public void setDeadline(int deadline) {
            this.deadline = deadline;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }
    }
}