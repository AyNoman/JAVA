package Account;

public abstract class Account {

    private String accountNum, accountholderName;

    public void setaccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setaccountholderName(String accountholderName) {
        this.accountholderName = accountholderName;
    }

    public String getaccountNum() {
        return accountNum;
    }

    public String getaccountholderName() {
        return accountholderName;
    }

    public void showDetails() {
        System.out.println(getaccountNum());
        System.out.println(getaccountholderName());
    }
}
