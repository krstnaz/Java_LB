public class Client extends Person
{
    private String bank;
    private String type;
    private Bill bill;

    public Client()
    {
        super();
    }

    public Client(String name)
    {
        super(name);
    }

    public Client(String name, String bank)
    {
        super(name);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void returnType()
    {
        System.out.println(type);
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
