public abstract class Account implements ITransaction {

    private static final int HEADQUARTER = 1;
    private static int SEQ = 1;

    protected int agency;
    protected int identify;
    protected Double balance = 0.0d;

    public Account() {
        this.agency = Account.HEADQUARTER;
        this.identify = SEQ++;
    } 

    public int getAgency() {
        return agency;
    }

    public int getIdentify() {
        return identify;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public void deposit(Double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(Double value) {
        this.balance -= value;
    }

    @Override
    public void transfer(Double value, Account receive) {
        this.withdraw(value);
        receive.deposit(value);
    }

    protected void InfoFunds() {
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account: %d", this.identify));
        System.out.println(String.format("Amount: %.2f", this.balance));
    }
    
}
