#include<stdio.h>
#include<stdbool.h>

bool CheckSmall(char ch)
{
	if((ch>='a')&&(ch<='z'))
	{
		return true;
	}
	else
	{
		return false;
	}
}
int main()
{
	char cValue='\0';
	bool bRet=false;
	
	printf("Plese enter one character\n");
	scanf("%c",&cValue);
	
	bRet=CheckSmall(cValue);
	
	if(bRet==true)
	{
		printf("%c is a small charater \n",cValue);
	}
	else
	{
		printf("%c is not a small charater \n",cValue);
	}
	
	return 0;
}