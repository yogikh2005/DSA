import java.lang.*;
import java.util.*;
class StringX
{
	public int countLower(String s)
	{
		int iCnt=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a') && (arr[i]<='z'))
				iCnt++;
		}
		return iCnt;
	}
}
class CountLowerCase
{
	public static void main(String argv[])
	{
	String str;
	int iRet=0;
	Scanner sobj=new Scanner(System.in);
	
	System.out.print("Enter the String");
	str=sobj.nextLine();
	
	StringX st=new StringX();
	iRet=st.countLower(str);
	
	System.out.println("Lower case later in string is "+iRet);
}}