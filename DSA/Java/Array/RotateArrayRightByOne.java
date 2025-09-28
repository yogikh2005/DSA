import java.lang.*;
import java.util.*;

class ArrayX {
    public int[] rotateArrayRight(int n, int[] arr) {
        int temp = arr[n - 1]; // store last element
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // shift right
        }
        arr[0] = temp; // put last element at the start
        return arr;
    }
}

class RotateArrayRightByOne {
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
        int[] rotatedArr = obj.rotateArrayRight(n, arr);

        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }

        sc.close();
    }
}
