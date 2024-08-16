package DesignPatterns.Adapter.PhonePe;

import DesignPatterns.Adapter.Bank.ICICIBank.ICICIBankApi;
import DesignPatterns.Adapter.Bank.ICICIBank.PaymentRequestICICIBank;
import DesignPatterns.Adapter.Bank.ICICIBank.PaymentResponseICICIBank;

public class ICICIBankAdapter implements UniversalInterfaceApi{
    ICICIBankApi api = new ICICIBankApi();
    @Override
    public int getbalance(String account) {
        return api.fetchBalance(account);
    }

    @Override
    public PaymentResponsePhonePe transfer(PaymentRequestPhonePe pr) {
        //create payment requests
        PaymentRequestICICIBank paymentRequestICICIBank = new PaymentRequestICICIBank(pr.toAccount,pr.fromAccount, pr.amount);
        PaymentResponseICICIBank paymentResponseICICIBank= api.sendMoney(paymentRequestICICIBank);
        PaymentResponsePhonePe paymentResponsePhonePe = new PaymentResponsePhonePe(paymentResponseICICIBank.message,paymentResponseICICIBank.success);
        return  paymentResponsePhonePe;
    }
}
