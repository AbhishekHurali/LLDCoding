package DesignPatterns.Adapter.PhonePe;

public class PhonePeLoan {
    public boolean checkLoan(String account,UniversalInterfaceApi api){
        if(api.getbalance(account) > 10000){
            return true;
        }
        return false;
    }
}
