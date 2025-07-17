#include<stdio.h>
void strrevX(char *str)
{
	char *start=str;
	char *end=str;
	char temp='\0';
	
	while(*end!='\0')
	{
		*end++;
	}
	*end--;
	
	while(start<end)
	{
		temp=*start;
		*start=*end;
		*end=temp;
		
		start++;
		end--;
	}
	
	
	
}

int main()
{
	char str[20];

	printf("Enter the string \n");
	scanf("%[^'\n']s",&str);
	
	strrevX(str);
	
	printf("String after the reverse %s",str);
	return 0;
}
