#include<stdio.h>

int SumOfDigit(int iNo)
{
	int iSum=0;
	if(iNo<0)
	{
		iNo=-iNo;
	}
	while(iNo!=0)
	{
		iSum=iSum+(iNo%10);
		iNo/=10;
	}
	
	return iSum;
}

int main()
{
	int iRes=0;
	int iValue=0;
	
	printf("Enter the number \n");
	scanf("%d",&iValue);
	
	iRes=SumOfDigit(iValue);
	printf("Sum of digit is %d",iRes);
	
	
	return 0;
	
}