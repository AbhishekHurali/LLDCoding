package Phonepe;

public class Client {
    public static void main(String[] args) {
//        UPI u = new YesBankUPI();
//
//        u.checkBalance("12345");
//        u.transfer("12345","67890");
        //Now Phonepe wanted to change the user bank from yesbank to icicibank
        //only changes it needed to make was
        UPI u1 = new ICICIBankUPI();
        u1.checkBalance("12345");
        u1.transfer("12345","67890");
    }
}
