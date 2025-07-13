#include<stdio.h>

int CountFrequency(char *str,char ch)
{
	int iCnt=0;
	while(*str!='\0')
	{
		if(*str==ch||*str==(ch-32)||*str==(ch+32))
		{
			iCnt++;
		}
		*str++;
	}
	
	return iCnt;
} 

int main()
{
	char str[10],ch;
	int iRet;
	
	printf("Enter the string:\n");
    scanf("%[^'\n']s", str);

    printf("Enter the character:\n");
    scanf(" %c", &ch); 
	
	iRet=CountFrequency(str,ch);
	
	printf("Frequncy of %c in string %s is %d\n",ch,str,iRet);
	
	return 0;
}