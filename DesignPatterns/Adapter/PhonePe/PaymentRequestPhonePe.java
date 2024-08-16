package DesignPatterns.Adapter.PhonePe;

public class PaymentRequestPhonePe {
    String toAccount;
    String fromAccount;
    int amount;

    public PaymentRequestPhonePe(String toAccount,String fromAccount,int amount){
        this.toAccount = toAccount;
        this.fromAccount = fromAccount;
        this.amount = amount;
    }
}
