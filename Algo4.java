public class Algo4 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            int endIndex = numbers.length - 1 - i;
            numbers[i] = numbers[endIndex];
            numbers[endIndex] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
