import java.lang.*;
import java.util.*;

class ArrayX
{
	public boolean isArraySorted(int iArr[])
	{
		for(int i=0;i<iArr.length;i++)
		{
			if(iArr[i]>iArr[i+1])
			{
				return false;
			}
		}
	
	
    	return true;
	}
}	


class ArraySortedCheck
{
   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		int iSize,i;
		
		System.out.println("Enter the size of array");
		iSize=sc.nextInt();
		
		int iArr[]=new int[iSize];
		
		System.out.println("Enter the array elements");
		for(i=0;i<iSize;i++)
		{
			iArr[i]=sc.nextInt();
		}
		
	
		ArrayX aobj=new ArrayX();
		boolean bRet=aobj.isArraySorted(iArr);
		if(bRet==true)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
				
		
		
	}
}