package withexceptionhandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            int arr[] = {23,43,12,22,56,34};
            System.out.println("arr length is : "+arr.length);
            System.out.println("arr index 0th element is : "+arr[0]);
            System.out.println("arr index 6th element is :"+arr[6]);

            // add dummy lines
            String msg1 = "Hello";
            String msg2 = null;
            System.out.println("msg1 length is : " + msg1.length());
            System.out.println("msg2 length is : " + msg2.length());
            int a=10, b=0,  res=0;
            res =a/b;

            // add dummy lines
            System.out.println("res is : "+res);
        } catch (ArithmeticException e){
            System.out.println("exception occurred : "+e.getMessage()+"---"+e.getClass());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception occurred : "+e.getMessage()+"---"+e.getClass());
        } catch (NullPointerException e){
            // add dummy lines
            System.out.println("exception occurred : "+e.getMessage()+"---"+e.getClass());
        }

    }
}
