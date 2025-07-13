#include<stdio.h>
int strlenX(char *str)
{
	int iCnt=0;
	while(*str!='\0')
	{
		iCnt++;
		str++;
	}
	return iCnt;
}


int main()
{
	char arr[10];
		int iRet=0;

	printf("Enter the string\n");
	scanf("%[^'\n']s",arr);

	iRet=strlenX(arr);
	
	printf("length of the string is %d",iRet);
	
	return 0;

}
