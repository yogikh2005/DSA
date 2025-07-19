import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Class Name :        StringX
//  Function Name :     toUpperCase
//  Description :       It convert first letter of words in  uppercase  
//  Input :             String
//  Output :            String
//  Author :            Yogiraj Mohan Khaladkar
//  Date :              19/7/2025
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
	public String toUpperCase(String str)
	{	
		
		StringBuilder sb=new StringBuilder();
		char c=Character.toUpperCase(str.charAt(0));
		sb.append(c);
		
		for(int i =1;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && i<str.length()-1)
			{
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		
		return sb.toString();
	}
}

class TitleCaseConvert
{
	public static void main(String argv[])
	{
		String str;
		String  sRes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		str=sc.nextLine();
		
		StringX s=new StringX();
		sRes=s.toUpperCase(str);
		
		System.out.println("The string is "+sRes);
		
	}
}