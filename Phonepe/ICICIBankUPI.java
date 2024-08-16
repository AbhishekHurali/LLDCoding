package Phonepe;

public class ICICIBankUPI implements UPI {
    public int checkBalance(String accountNumber)
    {
        System.out.println("Get balance of ICICIBank");
        return 0;
    }

    public void transfer(String FromAccount,String toAccount)
    {
        System.out.println("Transferring money through ICICIBank");
    }
}
