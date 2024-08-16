package DesignPatterns.Adapter.PhonePe;

import DesignPatterns.Adapter.Bank.YesBank.PaymentRequestYesBank;
import DesignPatterns.Adapter.Bank.YesBank.PaymentResponseYesBank;
import DesignPatterns.Adapter.Bank.YesBank.YesBankApi;

public class YesBankAdapter implements UniversalInterfaceApi {
    YesBankApi api = new YesBankApi();


    @Override
    public int getbalance(String account) {
        return api.knowBalance(account);
    }

    @Override
    public PaymentResponsePhonePe transfer(PaymentRequestPhonePe pr) {
        PaymentRequestYesBank paymentRequestYesBank = new PaymentRequestYesBank(pr.toAccount,pr.fromAccount);
        api.setTransferringAmount(pr.amount);
        PaymentResponseYesBank paymentResponseYesBank = api.TransferMoney(paymentRequestYesBank);
        PaymentResponsePhonePe paymentResponsePhonePe = new PaymentResponsePhonePe(paymentResponseYesBank.message,!paymentResponseYesBank.error);
        return paymentResponsePhonePe;
    }
}
