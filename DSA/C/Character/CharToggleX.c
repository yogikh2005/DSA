#include<stdio.h>
char CharToggelx(char ch)
{
	if((ch>=''A)&&(ch<='Z'))
	{
		return ch+32;
	}
	else if((ch>='a')&&(ch<='z'))
	{
		return -32;
	}
	else
	{
		return ch;
	}
	
}
int main()
{
	char cValue='\0';
	char cRet='\0';
	
	printf("Enter the character\n");
	scanf("%c",&cValue);
	
	cRet=CharToggelx(cValue);
	
	printf("Toggeled character is:%c\n",cRet);
	
	return 0;
}