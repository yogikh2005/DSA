class SingleNonDuplicate {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;

        while(s<=e)
        {   
            int mid = s + (e-s)/2;
            
            if(s==e) return nums[s]; // ek ch ele

            int curr = nums[mid]; // cuurnt ele

            int prev = -1;
            if(mid - 1 >=0 )
                prev = nums[mid-1]; // prev

            int next = -1;
            if(mid + 1 < n )
                next = nums[mid+1]; // next

            if(curr!=prev && curr!=next) // cur ani next diff
                return curr;
            
            if(curr!=prev && curr==next)  // next is same
            {
                int index = mid;
                if((index & 1) ==1) // start index odd tar move to left
                    e = mid -1;
                else
                    s = mid + 1; // start index even tar move to right 
            }
            else if(curr==prev && curr!=next)
            {
                int index = mid;
                if((index & 1) ==1) // end index odd tar move to right
                    s = mid + 1;
                else
                    e = mid -1;     // end index even tar move to left
            }

        }
        return -1;
    }

    
    public static void main(String[] args) {

        int arr[] = {3,3,7,7,10,11,11};

        System.out.println("Single Non Dublicate = " + singleNonDuplicate(arr));
    }
}