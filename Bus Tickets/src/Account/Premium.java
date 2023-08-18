package Account;

public class Premium extends Account {

    private String buy;

    public void setbuy(String buy) {
        this.buy = buy;
    }

    public String getbuy() {
        return buy;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Buy-" + buy);
    }
}
