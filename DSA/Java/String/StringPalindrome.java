import java.lang.*;
import java.util.*;

class StringX
{
	public boolean isStringPalindrome(String str)
	{
		int n=str.length();
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(n-i-1))
				return false;
		}
		return true;
	}
}

class StringPalindrome
{
	public static void main(String argv[])
	{
		String str;
		boolean bRes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		str=sc.next();
		
		StringX s=new StringX();
		bRes=s.isStringPalindrome(str);
		if(bRes==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}