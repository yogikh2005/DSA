import java.lang.*;
import java.util.*;

class TwoSumChecker {
    public String read(int n, int[] book, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int a = book[i];
            int more = target - a;
            
            if (mpp.containsKey(more)) {
                return "YES"; 
            }
            
            mpp.put(a, i);
        }
        
        return "NO";
    }
}

class TwoSumSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, target;
        
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        
        int[] book = new int[n];
        
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            book[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum");
        target = sc.nextInt();
        
        TwoSumChecker checker = new TwoSumChecker();
        String result = checker.read(n, book, target);
        System.out.println("Two sum exists: " + result);
        
        sc.close();
    }
}