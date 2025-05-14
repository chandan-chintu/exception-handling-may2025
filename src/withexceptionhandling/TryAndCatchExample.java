package withexceptionhandling;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        int res =0;
        try{
            // monitor code
            System.out.println("inside try block before exception occurs");
            res =a/b;
            System.out.println("inside try block after exception occurs");
        } catch (ArithmeticException e) {
            // handle exception
            System.out.println("Some exception occurred : "+e.getMessage());
        }

        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        System.out.println("res is : "+res);
    }
}
