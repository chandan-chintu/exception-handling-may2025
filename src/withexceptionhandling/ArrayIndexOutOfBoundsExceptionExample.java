package withexceptionhandling;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try{
            int arr[] = {23,43,12,22,56,34};

            System.out.println("arr length is : "+arr.length);
            System.out.println("arr index 0th element is : "+arr[0]);
            System.out.println("arr index 1st element is :"+arr[1]);
            System.out.println("arr index 5th element is :"+arr[5]);
            System.out.println("arr index 6th element is :"+arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occurred : "+e.getMessage());
        }

    }
}
