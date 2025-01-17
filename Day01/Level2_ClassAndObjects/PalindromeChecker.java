import java.util.*;

class PalindromeChecker {
    private String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Clean and normalize the text
        int length = cleanedText.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the text
        System.out.print("Enter text to check for palindrome: ");
        String text = input.nextLine();

        // Create PalindromeChecker object and display the result
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
    }
}

