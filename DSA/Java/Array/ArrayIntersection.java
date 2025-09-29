import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

  
    public static ArrayList<Integer> findArrayIntersection(int[] A, int[] B) {
        int i = 0;
        int j = 0; 
        ArrayList<Integer> ans = new ArrayList<>();

   
        int n = A.length;
        int m = B.length;

        while (i < n && j < m) {

            if (A[i] < B[j]) {
                i++;
            }
        
            else if (B[j] < A[i]) {
                j++;
            }
  
            else {
                ans.add(A[i]);
                i++;
                j++;
            }
        }

        return ans;
    }

  
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};

        List<Integer> intersectionResult = findArrayIntersection(arr1, arr2);

        System.out.println("Array A: [1, 2, 2, 3, 3, 4, 5, 6]");
        System.out.println("Array B: [2, 3, 3, 5, 6, 6, 7]");
        System.out.println("Intersection: " + intersectionResult);
 
    }
}