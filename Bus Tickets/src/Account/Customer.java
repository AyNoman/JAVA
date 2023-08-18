package Account;

public class Customer {

    Account accounts[] = new Account[1];

    public void addAccount(Account a) {
        int acc = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = a;
                acc = 1;
                break;
            }
        }
        if (acc == 1) {
            System.out.println("Inserted");
        } else {
            System.out.println("Can not Insert");
        }
    }
}
