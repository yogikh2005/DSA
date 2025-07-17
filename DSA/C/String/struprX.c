#include<stdio.h>
void struprX(char *str)
{
	while(*str!='\0')
	{
		if((*str>='a')&&(*str<='z'))
		{
			*str=*str-32;
		}
		*str++;
	}
}
int main()
{
	
	char str[20];
	
	printf("Enter the string\n");
	scanf("%s",&str);
	
	struprX(str);
	
	printf("After string uppercase %s",str);
	
	return 0;
}