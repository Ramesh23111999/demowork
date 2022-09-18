import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j, m;
        System.out.println("enter  the number :");
        n = input.nextInt();

        m = (n + 1) / 2;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    if (m > i) {
                        System.out.print(n - i + 1);
                    } else {
                        System.out.print(i);
                    }
                } else if (n + 1 == i + j) {
                    if (m > i) {
                        System.out.print(i);
                    } else {
                        System.out.print(j);
                    }
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println("\n");
        }

    }
}