package DesignPatterns.Adapter.PhonePe;

public interface UniversalInterfaceApi {
   public int getbalance(String account);
    public PaymentResponsePhonePe transfer(PaymentRequestPhonePe pr);
}
