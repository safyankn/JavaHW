package review2;

public class IfElse {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("You can get a drivers license");
        } else {
            System.out.println("You are not eligible for DL");
        }

        System.out.println(" ----------------- ");

        String expected="Best Sellers";

        if (expected.equals("Best Sellers")) {
            System.out.println("Test Passes");
        }else{
            System.out.println("Test fail");
        }

    }
}
