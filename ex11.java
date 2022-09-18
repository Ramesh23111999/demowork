import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = input.next();
        System.out.print("enter 2nd name:");
        ;
        String fname = input.next();
        System.out.println();
        System.out.println("that name is\n" + name + "  " + fname);
    }

}