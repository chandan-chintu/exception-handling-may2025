package beforeexceptionhandling;

public class DemoClass {
    public static void main(String[] args) {

        // exception not handled example
        int a =10;
        int b=0;
        int res = 0;

        res=a/b;

        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        System.out.println("res is :"+res);

    }
}
