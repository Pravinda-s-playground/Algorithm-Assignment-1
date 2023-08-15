public class Algo8 {
    public static void main(String[] args) {
        int[] setA = {5, 7, -2, 3, 4, 6, -8};
        int[] setB = {7, 8, 2, 1, -9, 6};
        
        // Union of sets
        System.out.print("Union of setA and setB {");
        for (int i = 0; i < setA.length; i++) {
            boolean foundInSetB = false;
            for (int j = 0; j < setB.length; j++) {
                if (setA[i] == setB[j]) {
                    foundInSetB = true;
                    break;
                }
            }
            if (!foundInSetB) {
                System.out.print(setA[i] + ", ");
            }
        }
        
        // Add the elements from setB that are not in setA
        for (int i = 0; i < setB.length; i++) {
            boolean foundInSetA = false;
            for (int j = 0; j < setA.length; j++) {
                if (setB[i] == setA[j]) {
                    foundInSetA = true;
                    break;
                }
            }
            if (!foundInSetA) {
                System.out.print(setB[i] + ", ");
            }
        }
        
        System.out.println("\b".repeat(2) + "}");
    }
}
