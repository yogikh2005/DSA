#include<stdio.h>

int Factorial(int iNo)
{
	int iFact=1;
	int i=1;
	while(i<=iNo)
	{
		iFact*=i;
		i++;
	}
	return iFact;
}

int main()
{
	int iValue=0;
	int iRes=0;
	
	printf("Enter the number to find factorial\n");
	scanf("%d",&iValue);
	
	iRes=Factorial(iValue);
	
	printf("The factorial of the %d is %d\n",iValue,iRes);
	return 0;
}