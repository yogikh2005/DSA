import java.util.*;

class MissingNumberFinder {
    public static int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;
        int n = N - 1;

        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i + 1);
        }

        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};  // Example input (missing 3)
        int N = 5;  // Numbers should be from 1 to 5
        System.out.println("Missing Number: " + missingNumber(arr, N));
    }
}
