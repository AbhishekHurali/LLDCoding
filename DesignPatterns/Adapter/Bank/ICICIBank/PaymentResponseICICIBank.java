package DesignPatterns.Adapter.Bank.ICICIBank;

public class PaymentResponseICICIBank {
    public String message;
    public boolean success;
    public String transactionId;

    public PaymentResponseICICIBank(String message,boolean success,String transactionId){
        this.message = message;
        this.success = success;
        this.transactionId = transactionId;
    }
}
