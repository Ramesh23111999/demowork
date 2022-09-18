import java.util.Scanner;

public class table {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("which table(enter the number)=");
        int num1 = input.nextInt();

        for (int i = 1; i < 10; i++) {

            int num3 = num1 * i;
            System.out.println(num1 + "x" + i + "=" + num3);

        }

    }
}