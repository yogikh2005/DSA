import java.lang.*;
import java.util.*;

class ArrayX {
    public int[] rotateArray(int n, int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }
}

class RotateArrayLeftByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayX obj = new ArrayX();
        int[] rotatedArr = obj.rotateArray(n, arr);

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }

        sc.close();
    }
}
