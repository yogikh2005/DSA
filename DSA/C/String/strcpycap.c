#include<stdio.h>
void strcpycap(char *str,char *str2)
{
	while(*str!='\0')
	{
		if((*str>='a')&&(*str<='z'))
		{
			*str2=*str-32;
		}
		else
		{
			*str2=*str;
		}
		*str++;
		*str2++:	
	}
	
	*str2='\0';
	
}
int main()
{
	char str[20];
	char str2[20];
	
	printf("Enter the string \n");
	scanf("%[^'\n']s",str);
	
	strcpycap(str,str2);
	
	printf("Original string is %s\n",str);
	printf("String after copy with capital %s\n",str2);
	return 0;
}
