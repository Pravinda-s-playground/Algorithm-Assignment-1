import java.util.Scanner;

class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        while (true) {
            System.out.print("Enter a sentence: ");
            String inputSentence = scanner.nextLine().trim();

            if (inputSentence.isEmpty()) {
                System.out.println("Invalid input");
                continue;
            }

            String[] wordsArray = inputSentence.split("\\s+");
            System.out.println("Words: " + String.join(", ", wordsArray));

            int shortestIndex = 0, longestIndex = 0;
            for (int i = 0; i < wordsArray.length; i++) {
                if (wordsArray[i].length() < wordsArray[shortestIndex].length()) {
                    shortestIndex = i;
                }
                if (wordsArray[i].length() > wordsArray[longestIndex].length()) {
                    longestIndex = i;
                }
            }

            System.out.println("Shortest word is \"" + wordsArray[shortestIndex] + "\" with a length of " + wordsArray[shortestIndex].length());
            System.out.println("Longest word is \"" + wordsArray[longestIndex] + "\" with a length of " + wordsArray[longestIndex].length());
        }
    }
}
