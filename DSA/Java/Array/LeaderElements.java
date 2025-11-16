import java.util.*;

public class LeaderElements {

    public static List<Integer> superiorElements(List<Integer> a) {

        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int n = a.size();

        
        for (int i = n - 1; i >= 0; i--) {
            if (a.get(i) > maxi) {
                ans.add(a.get(i));
            }
            
            maxi = Math.max(maxi, a.get(i));
        }

    
        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 5);
        System.out.println(superiorElements(arr));  
    }
}
