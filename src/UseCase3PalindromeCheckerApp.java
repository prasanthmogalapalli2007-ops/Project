/*
 UC3 - Palindrome Check Using String Reverse
 Author: Prasanth
*/

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Input text : " + original);
            System.out.println("Reversed text : " + reversed);
            System.out.println("Is it Palindrome : true");
        } else {
            System.out.println("Input text : " + original);
            System.out.println("Reversed text : " + reversed);
            System.out.println("Is it Palindrome : false");
        }
    }
}