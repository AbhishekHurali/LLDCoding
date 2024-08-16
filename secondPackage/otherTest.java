package secondPackage;

import firstPackage.test;

public class otherTest extends test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.name);
       // System.out.println(t.age);
        System.out.println(t.Qualification);
        //System.out.println(t.phone);
    }
}
