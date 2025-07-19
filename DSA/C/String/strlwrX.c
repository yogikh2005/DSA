#include<stdio.h>
void strlwrX(char *str)
{
	while(*str!='\0')
	{
		if((*str>='A')&&(*str<='Z'))
		{
			*str=*str+32;
		}
		*str++;
	}
}
int main()
{
	
	
	char str[20];
	
	printf("Enter the string\n");
	scanf("%s",&str);
	
	strlwrX(str);
	
	printf("After string lowercase %s",str);
	
	return 0;
}
