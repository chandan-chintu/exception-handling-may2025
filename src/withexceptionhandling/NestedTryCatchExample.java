package withexceptionhandling;

public class NestedTryCatchExample {
    public static void main(String[] args) {

        try{
            System.out.println("inside 1st try block");
            int arr[] = {23,43,12,22,56,34};

            System.out.println("arr length is : "+arr.length);
            System.out.println("arr index 0th element is : "+arr[0]);
            System.out.println("arr index 1st element is :"+arr[1]);
            System.out.println("arr index 5th element is :"+arr[5]);
            //System.out.println("arr index 6th element is :"+arr[6]);

            try{
                System.out.println("inside 2nd try block");
                String msg1 = "Hello";
                String msg2 = null;

                System.out.println("msg1 length is : " + msg1.length());
                //System.out.println("msg2 length is : " + msg2.length());
                try{
                    System.out.println("inside 3rd try block");
                    int a=10,b=0,res=0;
                    res=a/b;
                    System.out.println("res is : "+res);
                } catch (Exception e){
                    System.out.println("inside 3rd catch block");
                    System.out.println("Exception occurred :"+e.getMessage());
                }
            } catch (Exception e ){
                System.out.println("inside 2nd catch block");
                System.out.println("Exception occurred :"+e.getMessage());
            }
        } catch (Exception e){
            System.out.println("inside 1st catch block");
            System.out.println("exception occurred : "+e.getMessage());
        }

    }
}
