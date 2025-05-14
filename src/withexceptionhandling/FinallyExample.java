package withexceptionhandling;

public class FinallyExample {
    public static void main(String[] args) {
        int a=10, b=10,res=0;
        try{
            res =a/b;
            System.out.println("ending try");
        } catch (Exception e){
            System.out.println("exception occurred : "+e.getMessage());
        }
        finally {
            System.out.println("it will always execute");
        }
        System.out.println("after try, catch and finally");
    }
}
