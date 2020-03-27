import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Point point = new Point(1, 2);
        Point point1 = new Point(3,5);

        Map <Point, String> points = new HashMap<Point, String>();


        points.put(point, "hello");
        points.put(point1, "world");

        System.out.println(points.get(point));
        System.out.println(points.get(point1));
    }
}
