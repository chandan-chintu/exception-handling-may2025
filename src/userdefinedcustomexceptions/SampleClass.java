package userdefinedcustomexceptions;

public class SampleClass {
    public static void main(String[] args) {
        try{

            String product=null;
            if(product==null){
                throw new ProductNotFoundException("Product not found!");
            }

            String user = null;
            if(user==null){
                throw new UserNotFoundException("User not found!");
            }
        } catch (UserNotFoundException e) {
            System.out.println("Exception occurred : "+e.getMessage());
        } catch (ProductNotFoundException e) {
            System.out.println("Exception occurred : "+e.getMessage());
        }


    }
}
