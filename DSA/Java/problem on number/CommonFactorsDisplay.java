import java.util.*;

class Numbers
{
	public void CommonFactorsDisplay(int iNo1,int iNo2)
	{
		int iCnt=0;
		
		for(iCnt=1;(iCnt<=(iNo1/2))&&(iCnt<=(iNo2/2));iCnt++)
		{
			if(((iNo1%iCnt)==0 )&&(iNo2%iCnt)==0)
			{
					System.out.println(iCnt);
			}
		}
		
	}
}


class CommonFactorsDisplay
{
	public static void main(String argv[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int iNo1=sc.nextInt();
		
		System.out.println("Enter the number 2");
		int iNo2=sc.nextInt();
		
		Numbers nobj=new Numbers();

		nobj.CommonFactorsDisplay(iNo1,iNo2);
		
		
	}
}