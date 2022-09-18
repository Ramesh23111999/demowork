import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number is : ");
        int num1 = in.nextInt();

        for (int i = 0; i < 10; i++) {
            int num2 = i + 1;
            System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
        }
    }
}