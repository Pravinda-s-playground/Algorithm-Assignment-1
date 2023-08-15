import java.util.Scanner;

public class Algo1 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainLoop: do {
            System.out.print("Enter a positive number to generate Fibonacci series: ");
            int iterationNumber = scanner.nextInt();
            scanner.nextLine();
            if (iterationNumber <= 0) {
                System.out.println("Invalid input. Try again");
                continue mainLoop;
            } else if (iterationNumber == 1) {
                System.out.println("0");
            } else if (iterationNumber == 2) {
                System.out.println("0");
                System.out.println("1");
            } else {
                int[] fibonacciSeries = new int[iterationNumber];
                fibonacciSeries[0] = 0;
                fibonacciSeries[1] = 1;
                System.out.println(fibonacciSeries[0]);
                System.out.println(fibonacciSeries[1]);
                for (int i = 2; i < iterationNumber; i++) {
                    fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                    System.out.println(fibonacciSeries[i]);
                }
            }

        } while (true);
    }
}
