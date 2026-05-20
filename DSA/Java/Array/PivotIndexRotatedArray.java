

public class PivotIndexRotatedArray
{   
    static int findPivotIndex(int nums[])
    {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if(nums[s]<nums[e])
            return -1; // no effective rotation

        while(s<=e)
        {
            int mid = s + (e-s)/2;

            if(nums[mid]<=nums[n-1])
                e = mid - 1;
            else {
                ans = mid;
                s = mid + 1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        
        int arr[] = {50,60,70,10,20,30,40};

        System.out.println("Peak Element in array:"+findPivotIndex(arr));
        
    }
}