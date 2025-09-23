import java.lang.*;
import java.util.*;

class ArrayX
{
	public int secoundLargestElement(int iArr[])
	{
		int iLargest=iArr[0];
		int iSLargest=Integer.MIN_VALUE;

		for(int iStart=0;iStart<iArr.length;iStart++) 
		{
			if(iArr[iStart]>iLargest)
			{	iSLargest=iLargest;
				iLargest=iArr[iStart];
			}
			else if(iArr[iStart]>iSLargest && iArr[iStart]<iLargest)
			{
				iSLargest=iArr[iStart];
			}
		}
		return iSLargest;
	}
}

class ArraySecoundLargestElement
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
		int iRet=aobj.secoundLargestElement(iArr);
		System.out.println("Secound Largest element is : "+iRet);
		
				
		
		
	}
}