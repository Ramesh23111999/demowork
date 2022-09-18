import java.util.*;

public class star {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number=");
        int b = input.nextInt();
        System.out.print("Enter the Character=");
        String a = input.next();

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s\t", a);

            }
            System.out.print("\n\n");

        }
    }
}