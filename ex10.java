import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = 1;
        double num = 0;

        System.out.print("total numbers:");
        int n = in.nextInt();
        while (x <= n) {
            System.out.print("total number" + "(" + (int) x + ")" + ":");
            num += in.nextInt();
            x += 1;
        }
        double avg = (num / n);
        System.out.println("avg=" + avg);
    }
}