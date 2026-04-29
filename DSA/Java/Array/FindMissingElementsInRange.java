
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindMissingElementsInRange {

    static public List<Integer> findMissingElements(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) 
        {
            for (int j = nums[i] + 1; j < nums[i + 1]; j++) 
            {
                ans.add(j);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int a[] = {7, 8, 6, 9};
        for (int i : findMissingElements(a)) {

            System.out.println(i);
        }
    }
}
