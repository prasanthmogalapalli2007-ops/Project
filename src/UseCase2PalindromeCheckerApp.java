/*
 UC2 - Print a Hardcoded Palindrome Result
 Author: Prasanth
*/

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string
        boolean isPalindrome = true;

        // Compare characters from start and end
        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output format
        System.out.println("Input text : " + word);
        System.out.println("Is it Palindrome : " + isPalindrome);
    }
}