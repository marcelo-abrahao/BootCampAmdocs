package DigitalBank.src;

public class Saving extends Account{

    public Saving(Client client) {
        super(client);
    }

    @Override
    public void PrintFunds(){
        System.out.println("=== Saving Funds ===");
        super.InfoFunds();
    } 
}