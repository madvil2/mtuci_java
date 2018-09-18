import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Point3d[] points = new  Point3d[3];
        for (int i = 0; i < 3; i++) {
            String line = reader.readLine();
            String[] arr = line.split(" ");
            points[i] = new Point3d(Double.valueOf(arr[0]), Double.valueOf(arr[1]), Double.valueOf(arr[2]));
        }
        for (Point3d point : points) {
            for (Point3d point3d : points) {
                if (point == point3d) {
                    continue;
                }
                if (point.equals(point3d)) {
                    System.out.println("Equal points");
                    return;
                }
            }
        }
        System.out.println("Area: " + computeArea(points[0], points[1], points[2]));
    }

    public static double computeArea(Point3d first, Point3d second, Point3d third) {
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);
        double s = (a + b + c)/2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
