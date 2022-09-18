import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the tamil=");
        int tam = in.nextInt();
        System.out.print("enter the eng=");
        int eng = in.nextInt();
        System.out.print("enter the maths=");
        int maths = in.nextInt();
        System.out.print("enter the sci=");
        int sci = in.nextInt();
        System.out.print("enter the ss=");
        int ss = in.nextInt();
        double total = tam + eng + maths + sci + ss;
        double avg = total / 5;
        System.out.println("the average is =" + avg + "total =" + total);
    }
}