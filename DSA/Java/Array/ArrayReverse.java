import java.lang.*;
import java.util.*;

class ArrayX
{
	public void reverse(int iArr[])
	{
		int iStart=0,iLast=iArr.length-1;
		while(iStart<iLast)
		{
			int iTemp=iArr[iLast];
			iArr[iLast]=iArr[iStart];
			iArr[iStart]=iTemp;
			iStart++;
			iLast--;
		}
	}
}

class ArrayReverse
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
		aobj.reverse(iArr);
		
		System.out.println("\nAfter array reverse");
		for(i=0;i<iSize;i++)
		{
			System.out.print(iArr[i]+"\t");
		}			
		
		
	}
}