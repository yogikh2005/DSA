import java.lang.*;
import java.util.*;

class ArrayX
{
	public void pairs(int iArr[])
	{
		System.out.println("Array pairs:");
		for(int i=0;i<iArr.length;i++)
		{	
			int current=iArr[i]; 
			for(int j=i+1;j<iArr.length;j++)
			{
				System.out.print("("+current+","+iArr[j]+")");
			}
			System.out.println();
		}		
	}
}

class ArrayPairs
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
		aobj.pairs(iArr);
		
	}
}