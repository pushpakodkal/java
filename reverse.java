Here is an example of Java code to reverse a string using a for loop:

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
  }
}
