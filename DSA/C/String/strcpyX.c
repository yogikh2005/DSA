#include<stdio.h>

void strcpyX(char *str,char *dest)
{
	while(*str!='\0')
	{
		*dest=*str;
		
		*str++;
		*dest++;
	}
	*dest=*str;
}

int main()
{	
	char str[20];
	char str2[20];
	
	printf("Enter the string \n");
	scanf("%[^'\n']s",&str);
	
	strcpyX(str,str2);
	
	printf("The original string is %s\n",str);
	printf("The copy string is %s\n",str2);
	
	return 0;
}