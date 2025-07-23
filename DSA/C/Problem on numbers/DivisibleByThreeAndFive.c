#include<stdio.h>
#include<stdbool.h>

bool DivisibleByThreeAndFive(int iNo)
{
	if(iNo%3==0)
	{
		if(iNo%5==0)
		{
			return true;
		}
		else
		{
			return false;
		}
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
	
	bRes=DivisibleByThreeAndFive(iValue);
	if(bRes==true)
	{
		printf("The number is divisible by three and five\n");
	}
	else
	{
		printf("The number not is divisible by three and five\n");
	}
	return 0;
}