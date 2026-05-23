
class RemoveDublicatesFromSorteedArray {
    public static int removeDublicate(int[] nums) {

        int i = 0;
        int j = 1;
        int n = nums.length;

        while(j<n)
        {
            if(nums[j]==nums[i])
            {
                j++;
            }
            else
            {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
            return i+1;
    }
   
    public static void main(String[] args) {
        
        int arr[]={1,4,2,2,6,6};

        System.out.println("Length after remove dublicates :"+removeDublicate(arr));
            
        
    }

}