import java.lang.*;
import java.util.*;
class StringX
{
	public static int lengthX(String str)
	{
		int iCnt=0;
		char arr[]=str.toCharArray();
		for(char c:arr)
		{
			iCnt++;
		}
		return iCnt;
	}

}
class StringLengthCount
{
	
	
	public static void main(String arv[])
	{
	
	Scanner sc=new Scanner(System.in);
	
	String str=sc.nextLine();
	
	int iRet=StringX.lengthX(str);
	
	System.out.println("Length of string is"+iRet);
	
	}
}