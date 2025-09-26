import java.lang.*;
import java.util.*;

class ArrayX {
    public int[] rotateArray(int n, int d, int[] arr) {
        d = d % n;  // Handle cases where d > n
        int[] temp = new int[d];

        // Store first d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy temp back to the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        return arr;
    }
}

class RotateArrayLeftD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of positions to rotate:");
        int d = sc.nextInt();

        ArrayX obj = new ArrayX();
        int[] rotatedArr = obj.rotateArray(n, d, arr);

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }

        sc.close();
    }
}
