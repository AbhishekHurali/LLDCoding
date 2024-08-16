package ExceptionHandling;

public class Client {
    public static void test(int a){
        test(a*a);
    }
    public static void main(String[] args) throws Exception {
        try{
            int z = 0;
           //Student.doSomeThing(z);
            //db.query
             float y = 1/0;
//            String str = null;
//            str.length();
            test(10);
            System.out.println("hello ");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception, please don't give Zero");
        }
        catch(NullPointerException e)
        {
            System.out.println("String is not initialized");
        }
        catch (RuntimeException e)
        {
            System.out.println("Runtime Problems");
        }
        catch (Exception e)
        {
            System.out.println("Error Occurred + :" + e.getMessage());
        }
        catch (StackOverflowError e) {
            System.out.println("Fatal Error!");

        }finally {
            System.out.println("DB closed!");
        }
        System.out.println("Hello World");
    }
}
