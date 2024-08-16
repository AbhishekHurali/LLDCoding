package DesignPatterns.Adapter.Bank.YesBank;

public class PaymentRequestYesBank {
    String toAccount;
    String fromAccount;

    public PaymentRequestYesBank(String toAccount,String fromAccount){
        this.toAccount = toAccount;
        this.fromAccount = fromAccount;
    }
}
