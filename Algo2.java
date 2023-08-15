public class Algo2 {
    public static void main(String[] args) {
        int[] numbers = {-5, 2, 7, 10, 58, -7, 8, 23};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int currentNumber = numbers[j];
                int nextNumber = numbers[j + 1];
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = nextNumber;
                    numbers[j + 1] = currentNumber;
                }
            }
        }
        System.out.println("Minimum number is: " + numbers[0]);
        System.out.println("Maximum number is: " + numbers[numbers.length - 1]);
    }
}
