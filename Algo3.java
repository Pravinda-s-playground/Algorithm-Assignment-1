import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int[] reversedArray = new int[originalArray.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        originalArray = reversedArray;

        System.out.println(Arrays.toString(originalArray));
    }
}
