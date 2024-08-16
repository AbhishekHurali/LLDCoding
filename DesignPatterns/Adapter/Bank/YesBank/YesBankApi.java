package DesignPatterns.Adapter.Bank.YesBank;


public class YesBankApi {
    int amount;
    public int knowBalance(String account){
        return 0;
    }
    public void setTransferringAmount(int amount){
        this.amount = amount;
    }
    public PaymentResponseYesBank TransferMoney(PaymentRequestYesBank pr){
        //use the Payment request
        PaymentResponseYesBank paymentResponseYesBank = new PaymentResponseYesBank("Money transferred successfully",true);
        System.out.println("Transferring money from YesBank");
        return paymentResponseYesBank;
    }
}
