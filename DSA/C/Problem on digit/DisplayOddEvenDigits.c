#include<stdio.h>

void DisplayOddEvenDigits(int iNo)
{
	int iEvenCnt=0,iOddCnt=0,iDigit=0;
	
	if(iNo==0)
	{
		iEvenCnt++;
	}
	while(iNo!=0)
	{	
		iDigit=iNo%10;
		if(iDigit%2==0)
		{
			iEvenCnt++;
		}
		else
		{
			iOddCnt++;
		}
		iNo/=10;
	}
	
	printf("Even digit count is %d\n",iEvenCnt);
	printf("Odd digit count is %d",iOddCnt);
}

int main()
{
	
	int iValue=0;
	
	printf("Enter the number \n");
	scanf("%d",&iValue);
	
	DisplayOddEvenDigits(iValue);
	
	return 0;
	
}