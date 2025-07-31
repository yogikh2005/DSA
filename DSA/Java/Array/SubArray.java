import java.lang.*;
import java.util.*;

class ArrayX
{
	public void subArray(int iArr[])
	{
		System.out.println("Sub Array :");
		for(int i=0;i<iArr.length;i++)
		{	
			System.out.print("["+iArr[i]+"]\n");
			
			for(int j=i+1;j<iArr.length;j++)
			{	
				System.out.print("[");
				for(int k=i;k<=j;k++)
				{
					
					System.out.print(iArr[k]+" ");
					
				}
				System.out.print("]\n");
			}
			
			System.out.println();
		}		
	}
}

class SubArray
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
		aobj.subArray(iArr);
		
	}
}