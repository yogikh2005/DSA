import java.util.*;

class Numbers
{
	public void EvenFactorDisplay(int iNo)
	{
		int iCnt=0;
	
		for(iCnt=1;iCnt<=(iNo/2);iCnt++)
		{
			if((iNo%iCnt==0 )&&(iCnt%2==0))
			{
				System.out.println("Even factors is :"+iCnt);
			}
		}
	}
}

class EvenFactorDisplay
{
	public static void main(String arvg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int iNo=sc.nextInt();
		
		Numbers nobj=new Numbers();
		nobj.EvenFactorDisplay(iNo);
	}
	
}