package Phonepe;

public interface UPI {
    int checkBalance(String accountNumber);
    void transfer(String FromAccount,String toAccount);
}
