package DesignPatterns.Adapter.Bank.ICICIBank;

public class ICICIBankApi {

    public int fetchBalance(String account){
        return 0;
    }
    public PaymentResponseICICIBank sendMoney(PaymentRequestICICIBank pr){
        //use the Paymentrequest
        PaymentResponseICICIBank paymentResponseICICIBank = new PaymentResponseICICIBank("Money transferred successfully",true,"1234");
        System.out.println("Transferring money through ICICIBank");
        return paymentResponseICICIBank;
    }
}
