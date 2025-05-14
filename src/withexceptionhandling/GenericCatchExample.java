package withexceptionhandling;

public class GenericCatchExample {
    public static void main(String[] args) {
        try{
            int arr[] = {23,43,12,22,56,34};
            System.out.println("arr length is : "+arr.length);
            System.out.println("arr index 0th element is : "+arr[0]);
            System.out.println("arr index 6th element is :"+arr[6]);

            String msg1 = "Hello";
            String msg2 = null;
            System.out.println("msg1 length is : " + msg1.length());
            System.out.println("msg2 length is : " + msg2.length());

            int a=10, b=0,  res=0;
            res =a/b;
            System.out.println("res is : "+res);
        } catch (Exception e){
            System.out.println("exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
    }
}
