import java.util.Scanner;

class Algo9 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Enter a word to check palindrome: ");
            String word = scanner.nextLine().strip();
            char[] wordChars = word.toCharArray();

            // Validation
            if (word.isBlank()) {
                System.out.println("Word cannot be empty.");
                continue;
            } else {
                boolean containsDigits = false;
                for (char c : wordChars) {
                    if (Character.isDigit(c)) {
                        containsDigits = true;
                        break;
                    }
                }
                if (containsDigits) {
                    System.out.println("Enter ASCII characters only.");
                    continue;
                }
            }

            // Check palindrome
            String reversed = "";
            for (int i = wordChars.length - 1; i >= 0; i--) {
                reversed += wordChars[i];
            }

            if (reversed.equalsIgnoreCase(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        } while (true);
    }
}
