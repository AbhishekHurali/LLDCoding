package DesignPatterns.Adapter.PhonePe;

public class PaymentResponsePhonePe {
    String message;
    boolean success;

    public PaymentResponsePhonePe(String message,boolean success){
        this.message = message;
        this.success = success;
    }
}
