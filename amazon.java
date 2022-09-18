import java.util.Scanner;

class product {

    String details;

}

class customer extends product {

    double amount = 300;
    double total = 0;
}

class amazon {
    public static void main(String[] args) {
        customer p = new customer();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value: ");
        String d = input.next();

        p.total = p.amount * 2;
        System.out.println(
                "product name: " + d + "\n The amount is : " + p.amount + "\n the Total amount is : " + p.total);

    }

}