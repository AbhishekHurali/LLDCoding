package ExceptionHandling;

public class Student {
    String name;
    String batch;

    public static void doSomeThing(int x) throws Exception {
        if(x==0){
            throw new Exception("Normal Exception");
        }
        else if(x==1){
            throw new RuntimeException("Runtime Exception");

        }else if(x==2){
            throw new ArithmeticException("Arithmatic Exception");

        }else if(x==3)
        {
            throw  new ClassNotFoundException();
        }else if(x==4) {
            throw new CustomException("My custom Exception");
        }
    }
}
