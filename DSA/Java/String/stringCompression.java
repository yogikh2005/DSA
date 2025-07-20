import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Class Name :        StringX
//  Function Name :     strCompression
//  Description :       It compress the string. eg.aaabbc -> a3b2c1 
//  Input :             String
//  Output :            String
//  Author :            Yogiraj Mohan Khaladkar
//  Date :              20/7/2025
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
	public String strCompression(String str)
	{	
		
		StringBuilder sb=new StringBuilder();
		
		for(int i =0;i<str.length();i++)
		{
			int icnt=1;
			while(i<str.length()-1 &&str.charAt(i)==str.charAt(i+1))
			{
				icnt++;
				i++;
			}
			sb.append(str.charAt(i));
			if(icnt>1)
			{
				sb.append(icnt);
			}
		}
		
		return sb.toString();
	}
}

class stringCompression
{
	public static void main(String argv[])
	{
		String str;
		String  sRes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		str=sc.nextLine();
		
		StringX s=new StringX();
		sRes=s.strCompression(str);
		
		System.out.println("The string compression is "+sRes);
		
	}
}