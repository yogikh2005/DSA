import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Class Name :        StringX
//  Function Name :     IsStringsAnagarms
//  Description :      	It check the 2 string are anagrams or not
//  Input :             String
//  Output :            boolean
//  Author :            Yogiraj Mohan Khaladkar
//  Date :              20/7/2025
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
	public boolean IsStringsAnagarms(String str,String str2)
	{	
		if(str.length()==str2.length())
		{
			str=str.toLowerCase();
			str2=str2.toLowerCase();
			
			char arr[]=str.toCharArray();
			char arr2[]=str2.toCharArray();

			Arrays.sort(arr);
			Arrays.sort(arr2);
			if(Arrays.equals(arr,arr2))
			{
				return true;
			}
		}
		return false; 
	}
}

class stringAnagrams
{
	public static void main(String argv[])
	{
		String str,str2;
		Boolean  bRes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st string ");
		str=sc.nextLine();
		
		System.out.println("Enter the 2nd string ");
		str2=sc.nextLine();
		
		StringX s=new StringX();
		
		bRes=s.IsStringsAnagarms(str,str2);
		if(bRes==true)
		{
		System.out.println("The string are anagrams to each other");
		}
		else
		{
		System.out.println("The string are not anagrams to each other");
		}
		
	}
}