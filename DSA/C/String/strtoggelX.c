#include<stdio.h>
void strtoggeleX(char *str)
{
    while(*str!='\0')
	{
		if((*str>='a')&&(*str<='z'))
		{
			*str=*str-32;
		}
		else if((*str>='A')&&(*str<='Z'))
		{
			*str= *str+32;
		}
		*str++;
	}	
}

int main()
{
	char str[20];
	
	printf("Enter the string\n");
	scanf("%[^'\n']s",&str);
	
	printf("Original string :%s\n",str);
	
	strtoggeleX(str);
	
	printf("String after the toggel case:%s\n",str);
	
}

