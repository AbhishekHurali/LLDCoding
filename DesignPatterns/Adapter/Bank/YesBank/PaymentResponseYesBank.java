package DesignPatterns.Adapter.Bank.YesBank;

public class PaymentResponseYesBank {
    public String message;
    public boolean error;

    public PaymentResponseYesBank(String message,boolean error){
        this.message = message;
        this.error = error;
    }
}
