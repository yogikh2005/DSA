import java.lang.*;
import java.util.*;
class StringX
{
	public int countUpper(String s)
	{
		int iCnt=0;
		
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='A') && (s.charAt(i)<='Z'))
				iCnt++;
		}
		return iCnt;
	}
}
class CountUpperCase
{
	public static void main(String argv[])
	{
	String str;
	int iRet=0;
	Scanner sobj=new Scanner(System.in);
	
	System.out.print("Enter the String");
	str=sobj.nextLine();
	
	StringX st=new StringX();
	iRet=st.countUpper(str);
	
	System.out.println("Upper case later in string is "+iRet);
}}