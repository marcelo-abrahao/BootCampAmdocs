public interface ITransaction {

    void deposit(Double value);
    void withdraw(Double value);
    void transfer(Double value, Account receive);
    void PrintFunds();
}
