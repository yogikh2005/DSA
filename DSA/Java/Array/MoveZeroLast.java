import java.lang.*;

public class MoveZeroLast {

    public static int[] moveZeros(int n, int[] a) {
    
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

    
        if (j == -1) {
            return a;
        }

        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[] result = moveZeros(arr.length, arr);

        System.out.println("\nModified Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}