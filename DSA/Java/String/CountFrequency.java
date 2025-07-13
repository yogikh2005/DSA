import java.lang.*;
import java.util.*;
class StringX
{	
	public static int CountFrequency(String str,char ch)
	{
		int iCnt=0;
		str=str.toLowerCase();
		ch=Character.toLowerCase(ch);
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				iCnt++;
			}
		}
	
	return iCnt;
	} 
}

class CountFrequency
{
	public static void main(String argv[])
	{
		String s;
		char ch;
		int iRet;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		s=sc.nextLine();

		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		
		iRet=StringX.CountFrequency(s,ch);
		
		System.out.println("Frequncy of character is"+iRet);		
			
	}
}