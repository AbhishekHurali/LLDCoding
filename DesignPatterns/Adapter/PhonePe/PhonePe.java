package DesignPatterns.Adapter.PhonePe;

public class PhonePe {
    String account;
    UniversalInterfaceApi api;
    PhonePeLoan phonePeLoan = new PhonePeLoan();
    Payment payment = new Payment();

    public PhonePe(String account, UniversalInterfaceApi api) {
        this.account = account;
        this.api = api;
    }

    boolean checkLoan() {
        return phonePeLoan.checkLoan(account, api);
    }

    boolean transferMoney(String toAccount, int amount) {
        return payment.makePayment(account,toAccount,amount,api);
    }
}
