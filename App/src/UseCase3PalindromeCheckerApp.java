public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        boolean isPalindrome = input.equals(reverse);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}