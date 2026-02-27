import java.util.Scanner;

/*
@author prasanth
@version 1.0
  create a class
  print 3 statements
  after run  the program
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer approach
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (True)");
        } else {
            System.out.println(input + " is NOT a Palindrome (False)");
        }

        scanner.close();
    }
}

