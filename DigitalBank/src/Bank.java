public class Bank {

    public static void main(String[] args) {
        Account cc = new Checking();
        cc.deposit(254.10);

        Account cp = new Saving();
        cp.deposit(451.12);

        cc.PrintFunds();
        cp.PrintFunds();

        cc.transfer(254.10, cp);

        cc.PrintFunds();
        cp.PrintFunds();

    } 
}