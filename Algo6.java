import java.util.Scanner;

class Algo6 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Enter a sentence: ");
            String inputSentence = scanner.nextLine();
            char[] letterArray = inputSentence.strip().toCharArray();

            if (inputSentence.isBlank()) {
                continue;
            } else {
                int wordCount = 0;
                for (int i = 0; i < letterArray.length; i++) {
                    char c = letterArray[i];
                    if (c == ' ' || i == letterArray.length - 1) {
                        wordCount++;
                    }
                }

                String[] words = new String[wordCount];
                wordCount = 0;
                String tempWord = "";
                for (int i = 0; i < letterArray.length; i++) {
                    char c = letterArray[i];

                    if (c == ' ' || i == letterArray.length - 1) {
                        if (c != ' ') {
                            tempWord += c;
                        }
                        words[wordCount] = tempWord;
                        tempWord = "";
                        wordCount++;

                    } else {
                        tempWord += c;
                    }

                }

                for (int i = words.length - 1; i >= 0; i--) {
                    System.out.print(words[i] + " ");
                }
            }
            System.out.println("\n");
        } while (true);
    }
}
