#include<stdio.h>
#include<stdbool.h>

bool CheckPalindrome(int iNo)
{
	int iRev=0,iDigit=0;
	int iTemp=iNo;
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
	return (iTemp==iRev);
}

int main()
{
	
	int iValue=0;
	bool iRes=false;
	
	printf("Enter the number \n");
	scanf("%d",&iValue);
	
	iRes=CheckPalindrome(iValue);
	
	if(iRes==true)
		printf("The number is Palindrome\n");

	else
		printf("The number not is Palindrome\n");

	
	return 0;
	
}