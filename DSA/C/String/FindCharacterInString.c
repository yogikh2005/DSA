#include<stdio.h>
#include<stdbool.h>

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name :     isCharPresent
//  Description :       To check whether charater present in string or not
//  Input :             char array,char
//  Output :            bool
//  Author :            Yogiraj Mohan Khaladkar
//  Date :              13/7/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
bool isCharPresent(char *str,char ch)
{
	bool b=false;
	while(*str!='\0')
	{
		if(*str==ch)
		{
			b=true;
			break;
		}
		*str++;
	}
	return b;
}

int main()
{
	char str[20];
	char ch;
	bool res;
	printf("Enter the string");
	scanf("%[^'\n']s",&str);
	
	printf("Enter the charater ");
	scanf(" %c",&ch);

	res=isCharPresent(str,ch);
	if(res)
	{
		printf("Charater is present in string");
	}
	else
	{
		printf("Charater is not present in the string");
	}
	
	return 0;
}