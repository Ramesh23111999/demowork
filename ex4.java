import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1 = input.nextInt();
        System.out.print("enter the 2nd number:");
        int num2 = input.nextInt();
        int num3 = num1 * num2;
        System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
        System.out.printf("%d x %d = %d", num1, num2, num3);
    }
}