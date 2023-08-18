package Account;

import java.util.Scanner;

public class Test {
    
    public Test() {
        int count;
        Scanner go = new Scanner(System.in);
        do {
            System.out.println("What kind of Ticket?");
            System.out.println("1. Make Premium Account");
            System.out.println("2. Make Regular Account");
            System.out.println("Your Option- ");
            int option = go.nextInt();

            if (option == 1) {
                System.out.println("-----------------------------------------");
                System.out.println("You have choosen Premium account");
                System.out.println("-----------------------------------------");

                Customer c = new Customer();
                Account p1 = new Premium();
                c.addAccount(p1);
            }
            System.out.println("1. Try Again ");
            System.out.println("2. Go to the Next Steps ");
            count = go.nextInt();
        } while (count == 1);
    }
}
