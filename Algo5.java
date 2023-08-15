import java.util.Scanner;

class Algo5 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Enter ASCII text: ");
            String inputText = scanner.nextLine();
            inputText = inputText.strip();
            char[] textArray = inputText.toCharArray();

            if (inputText.isBlank()) {
                System.out.println("Invalid text: Try Again.");
                continue;
            } else {
                int lastIndex = textArray.length - 1;
                for (int i = 0; i < textArray.length / 2; i++) {
                    char temp = textArray[lastIndex - i];
                    textArray[lastIndex - i] = textArray[i];
                    textArray[i] = temp;
                }
            }

            for (char c : textArray) {
                System.out.print(c);
            }
            System.out.println();
        } while (true);
    }
}
