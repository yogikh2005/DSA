import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {

   
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0; // Pointer for array 'a'
        int j = 0; // Pointer for array 'b'
        ArrayList<Integer> unionArr = new ArrayList<>();

       
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
               
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

       
        while (i < n1) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }

        return unionArr;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int[] arr2 = {2, 3, 4, 4, 6, 7};

        List<Integer> unionResult = findUnion(arr1, arr2);

        System.out.println("Union of the two arrays is: " + unionResult);
      
    }
}