
public class ex12 {
    public static void main(String[] strings) {

        final double l = 8.5;
        final double w = 5.6;
        double perimeter = 2 * (l + w);
        double area = l * w;

        System.out.printf("rectangle perimeter is %.1f and %.1f =%.2f\n", l, w, perimeter);
        System.out.printf("rectangle area is %.1f and %.1f = %.2f\n", l, w, area);

    }
}