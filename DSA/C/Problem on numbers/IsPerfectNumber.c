#include<stdio.h>
#include<stdbool.h>

int SumOfFactors(int iNo)
{
	int iCnt=0;
	int iSum=0;
	//O(n/2)
	for(iCnt=1;iCnt<=(iNo/2);iCnt++)
	{
		if((iNo%iCnt)==0)
		{
			iSum+=iCnt;
		}
	}
	return iSum;
}

bool IsPerfectNumber(int iNo)
{
	int iRes=0;
	iRes=SumOfFactors(iNo);
	if(iRes==iNo)
	{
		return true	;
	}
	else
	{
		return false;
	}
}

int main()
{
	int iValue=0;
	bool bRes=false;
	
	printf("Enter the number\n");
	scanf("%d",&iValue);
	
	bRes=IsPerfectNumber(iValue);
	
	if(bRes)
	{
		printf("The %d is perfect number\n",iValue);
	}
	else
	{
		printf("The %d is not perfect number\n",iValue);
	}
	
	return 0;
}