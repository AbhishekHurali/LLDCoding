package Phonepe;

public class YesBankUPI implements UPI {
    public int checkBalance(String accountNumber)
    {
        System.out.println("Get balance of YESBank");
        return 0;
    }

    public void transfer(String FromAccount,String toAccount)
    {
        System.out.println("Transferring money through YESBank");
    }
}
