import java.util.*;

public class EbBill {
    static int preu, curu, unit, ebno;
    static String name;
    static float amt = 0.0f, tot = 0.0f, sub = 0.0f, chrg = 20, free = 0, fin = 0;

    static void details() {
        Scanner input = new Scanner(System.in);
        {

            System.out.println("Enter your Name and EB.No:");
            name = input.next();
            ebno = input.nextInt();
            System.out.println("Enter your Current uits and Previous units:");
            curu = input.nextInt();
            preu = input.nextInt();
        }
        unit = curu - preu;
        amt = (float) (1.5 * unit);
        tot = amt + chrg;

    }

    static void output()

    {
	System.out.println("***************************");
        System.out.println("Name=" + name);
        System.out.println("Eb.Number=" + ebno);
        System.out.println("Previous Units=" + preu);
        System.out.println("Current Units=" + curu);
        System.out.println("Consume Unit=" + unit);
        System.out.println("Unit Amount=" + amt);
        System.out.println("Total Amount=" + tot);
    }

    public static void main(String args[]) {
        details();
        if (unit < 100) {
            output();
            System.out.println("No need to Pay it is free unit");
        } else {
            output();
            System.out.println("*********************************");
            free = (float) (100 * 1.5);
            fin = tot - free;
            System.out.println(
                    "total amount " + tot + " and free unit amount " + free + " : total amount - free unit amount");
            tot = fin;
            System.out.println("Your pay amount is " + tot+" Rupees");
            System.out.println("*********************************");
        }
    }
}