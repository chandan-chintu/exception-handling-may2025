package withexceptionhandling;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            int a =10;
            if(a==10){
                throw new RuntimeException("a value is 10 and exception occurred");
            }

            String customer = null;
            if(customer == null){
                throw new RuntimeException("Customer not found in database");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
