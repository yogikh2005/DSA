import java.util.*;

class Numbers
{
	public int FactorsMultiplication(int iNo)
	{
		int iCnt=0;
		int iRes=1;
		for(iCnt=1;iCnt<=(iNo/2);iCnt++)
		{
			if(iNo%iCnt==0 )
			{
				iRes=iRes*iCnt;
			}
		}
		return iRes;
	}
}

class FactorsMultiplication
{
	public static void main(String arvg[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int iNo=sc.nextInt();
		
		Numbers nobj=new Numbers();
		int iRes=nobj.FactorsMultiplication(iNo);
		
		System.out.println("Multiplication of the factors "+iRes);
	}
	
}