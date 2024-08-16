package DesignPatterns.Adapter.PhonePe;

public class Payment {
    boolean makePayment(String fromAccount, String toAccount, int amount, UniversalInterfaceApi api) {

        if (api.getbalance(fromAccount) > amount) {
            PaymentRequestPhonePe paymentRequest = new PaymentRequestPhonePe(toAccount, fromAccount, amount);
            PaymentResponsePhonePe paymentResponse = api.transfer(paymentRequest);
            return paymentResponse.success;
        }
        return false;
    }
}