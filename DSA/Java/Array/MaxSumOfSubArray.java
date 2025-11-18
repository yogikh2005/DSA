//Kadane's algorithm
public class MaxSumOfSubArray
{
	static int MaxArraySum(int arr[],int n)
	{
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			
			if(sum>max)
				max=sum;
			if(sum<0)
				sum=0;
			
		}
		return max;
	}
	
	public static void main(String argv[])
	{
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Max sum array "+MaxArraySum(arr,arr.length));
		
	}
}
