import java.lang.*;
import java.util.*;

class ArrayX
{
	public int maxSubArraySum(int iArr[])
	{
		int iMax=Integer.MIN_VALUE;

		for(int i=0;i<iArr.length;i++)
		{	
	
			for(int j=i+1;j<iArr.length;j++)
			{	
				int itemp=0;
				for(int k=i;k<=j;k++)
				{
					itemp+=iArr[k];
				
				}
					if(itemp>iMax)
						iMax=itemp;
			}
		}	
			
		return iMax;
	}
}

class MaxSubArraySum
{
   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		int iSize,i,iRes;
		
		System.out.println("Enter the size of array");
		iSize=sc.nextInt();
		
		int iArr[]=new int[iSize];
		
		System.out.println("Enter the array elements");
		for(i=0;i<iSize;i++)
		{
			iArr[i]=sc.nextInt();
		}
		
		ArrayX aobj=new ArrayX();
		iRes=aobj.maxSubArraySum(iArr);
		
		System.out.println("The max sum of sub array "+iRes);
		
	}
}