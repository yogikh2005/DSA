import java.lang.*;
import java.util.*;

class ArrayX
{
	public int largestElement(int iArr[])
	{
		int iLargest=iArr[0];
        
		for(int iStart=0;iStart<iArr.length;iStart++) 
		{
			if(iArr[iStart]>iLargest)
			{
				iLargest=iArr[iStart];
			}
		}
		return iLargest;
	}
}

class ArrayLargestElement
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
		int iRet=aobj.largestElement(iArr);
		System.out.println("Largest element is : "+iRet);
		
				
		
		
	}
}