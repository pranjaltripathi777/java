public class Palindrome {

    public static void main(String[] args) {

        String text = "madam";

        String reversedText = new StringBuilder(text).reverse().toString();

        if (text.equals(reversedText)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
