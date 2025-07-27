#include<stdio.h>

int ReverseNumber(int iNo)
{
	int iRev=0,iDigit=0;
	
	if(iNo<=0)
	{
		iNo=-iNo;
	}
	while(iNo!=0)
	{	
		iDigit=iNo%10;
		iRev=(iRev*10)+iDigit;
		iNo/=10;
	}
	return iRev;
}

int main()
{
	
	int iValue=0,iRes=0;
	
	printf("Enter the number \n");
	scanf("%d",&iValue);
	
	iRes=ReverseNumber(iValue);
	
	printf("The reverse is %d",iRes);
	
	return 0;
	
}