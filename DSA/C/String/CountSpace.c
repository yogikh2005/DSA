#include<stdio.h>

int CountSpace(char *str)
{
	int iCnt=0;
	while(*str!='\0')
	{
		if(*str==' ')
		{
			iCnt++;
		}
		*str++;
	}
	return iCnt;
}

int main()
{	
	char str[20];
	int iRet=0;
	
	printf("Enter the string \n");
	scanf("%[^'\n']s",&str);
	
	iRet=CountSpace(str);
	
	printf("Spaces in the string %d",iRet);
	return 0;
}