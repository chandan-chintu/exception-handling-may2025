package withexceptionhandling;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String msg1 = "Hello";
            String msg2 = null;

            System.out.println("msg1 length is : " + msg1.length());
            System.out.println("msg2 length is : " + msg2.length());
        } catch (NullPointerException e) {
            System.out.println("Exception occurred : "+e.getMessage());
        }

    }
}
