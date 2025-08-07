#include<stdio.h>

///////////////////////////////////////////////////////////////////////////////
// Function Name:	CountDigit
// Description:      It count the digit in the number
// Input:            integer
// Output:           integer
// Auther:           Yogiraj Mohan Khaladkar
// Date :	        27/8/25
//////////////////////////////////////////////////////////////////////////////

int CountDigit(int iNo)
{
	int iCnt=0;
	if(iNo==0)//filter
	{
		return 1;
	}
	if(iNo<0)
	{
		iNo=-iNo;
	}
	while(iNo>0)
	{
		iNo=iNo/10;
		iCnt++;
	}
	
	return iCnt;
}

int main()
{
	int iRes=0;
	int iValue=0;
	
	printf("Enter the number \n");
	scanf("%d",&iValue);
	
	iRes=CountDigit(iValue);
	printf("Digit in the number is %d",iRes);
	
	
	return 0;
	
}