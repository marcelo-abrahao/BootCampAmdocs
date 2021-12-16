package DigitalBank.src;

public class Checking extends Account {

    public Checking(Client client) {
        super(client);
    }

    @Override
    public void PrintFunds(){
        System.out.println("=== Checking Funds ===");
        super.InfoFunds();
    }   
}