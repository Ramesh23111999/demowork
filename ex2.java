import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int Num2 = input.nextInt();
        double sum = Num1 + Num2;
        System.out.println();
        System.out.println("Answer is " + sum + "\tof\t" + Num1 + "\t" + Num2);
    }
}