import java.util.*;

public class sort {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int n, i, j;
        String a[], t;
        a = new String[50];
        System.out.println("Enter the no of terms:");
        n = input.nextInt();
        System.out.println("Enter the number:");
        for (i = 0; i < n; i++)
            a[i] = input.next();
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if ((a[i]).compareTo(a[j]) > 0) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Ascending order");
        System.out.println("***************************");
        for (i = 0; i < n; i++) {

            System.out.println("\t" + a[i]);

        }
        System.out.println("descending order");
        System.out.println("*************************");
        for (i = n - 1; i >= 0; i--) {
            System.out.println("\t" + a[i]);

        }
    }
}