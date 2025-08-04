import java.lang.*;
import java.util.Scanner;
class ArrayX
{
	public static int largestNoInArray(int arr[])
	{
		int iLarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(iLarge<arr[i])
				iLarge=arr[i];
		}
		return iLarge;
	}
}

class LargeInArray
{
	public static void main(String arvs[])
	{
		Scanner sc=new Scanner(System.in);
		int iRes,iValue;
		
		System.out.println("Enter the array size");
		iValue=sc.nextInt();
		
		int arr[]=new int[iValue];
		System.out.println("Enter the array elements");
		for(int i=0;i<iValue;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		iRes=ArrayX.largestNoInArray(arr);
		System.out.println("The largest number in array is "+iRes);
		
	}
}