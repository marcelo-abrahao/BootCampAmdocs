import javax.sql.rowset.spi.SyncResolver;

public class Checking extends Account {

    @Override
    public void PrintFunds(){
        System.out.println("=== Checking Funds ===");
        super.InfoFunds();
    }   
}