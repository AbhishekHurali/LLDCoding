package DesignPatterns.Adapter.Bank.ICICIBank;

public class PaymentRequestICICIBank {
    String toAccount;
    String fromAccount;
    int amount;

    public PaymentRequestICICIBank(String toAccount,String fromAccount,int amount){
        this.toAccount = toAccount;
        this.fromAccount = fromAccount;
        this.amount = amount;
    }
}
