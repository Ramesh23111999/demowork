import java.util.Scanner;

public class integerBill {
    static int cur, pre;
    static float total, unit;
    static double amount;

    static void details() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter your mobile number:");
            input.nextDouble();
            System.out.print("enter your name:");
            input.next();
            System.out.print("enter the current unit: ");
            cur = input.nextInt();
            System.out.print("enter previous unit:");
            pre = input.nextInt();
        }
        total = cur - pre;
        unit = total / 100;
        amount = unit * 2.17;
    }

    static void output() {

        System.out.println("total power=" + total);
        System.out.println("total unit=" + unit);
        System.out.println("total amount=" + amount);
    }

    public static void main(String[] args) {
        details();

        if (total > 100 && total < 2000) {

            System.out.println("unit 100 to 200:\ndetails ");
            output();
        } else if (total > 5000) {
            details();
            output();
        } else {
            System.out.println("out of range");
            ;
        }

    }
}
