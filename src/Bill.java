public class Bill
{
    private double balance;
    private String identifier;

    private Bill(double balance, String identifier) {
        this.balance = balance;
        this.identifier = identifier;
    }

    public static Bill createBill(double balance, String identifier)
    {
        return new Bill(balance, identifier);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
