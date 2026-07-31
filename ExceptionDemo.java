public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }

        System.out.println("Program executed successfully.");
    }
}
