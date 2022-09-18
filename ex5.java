import java.util.Scanner;

public class ex5 {
    static int num1, num2, sum, minus, multiple, divide, reminder2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        minus = num1 - num2;
        multiple = num1 * num2;
        divide = num1 / num2;
        reminder2 = num1 % num2;
        System.out.printf("1st number is %d \n2nd number is %d", num1, num2);
        System.out.printf("\nsum =%d\nminus=%d\nmultiple=%d\ndivide=%d\nreminder2=%d", sum, minus, multiple, divide,
                reminder2);

    }

}