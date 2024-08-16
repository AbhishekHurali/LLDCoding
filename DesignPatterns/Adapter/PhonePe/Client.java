package DesignPatterns.Adapter.PhonePe;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe("12345",new ICICIBankAdapter());
    }
}
