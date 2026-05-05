class MaxSumArray {
    public static int maxSubArray(int[] nums) {
        
        int sum = 0 ;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            if(sum>maxsum) // Filter
                maxsum=sum;
            
            // maxsum = Math.max(sum,maxsum); 

            if(sum<0)   // updater
                sum = 0;

        }
        return maxsum;
    }

    public static void main(String arvg[])
    {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.err.println("Max Sum from subarray : "+maxSubArray(arr));
    }

}