package DigitalBank.src;

public class main {
        public static void main(String[] args) {

        Client marcelo = new Client();
        marcelo.setClientName("Marcelo");
        marcelo.setClientID(102030);

        Account cc = new Checking(marcelo);
        cc.deposit(254.10);

        Account cp = new Saving(marcelo);
        cp.deposit(451.12);

        cc.PrintFunds();
        cp.PrintFunds();

        cc.transfer(254.10, cp);

        cc.PrintFunds();
        cp.PrintFunds();

    } 
    
}
