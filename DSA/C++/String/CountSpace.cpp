#include<iostream>
using namespace std;
class StringX
{
	public:
	
	int countSpace(char *str)
	{
		int iCnt=0;
		while(*str!='\0')
		{
			if(*str==' ')
				iCnt++;
			
			str++;
		}
		return iCnt;
	}
};

int main()
{
	char str[20];
	int iRet=0;
	
	cout<<"Enter the string \n";
	 cin.getline(str, 20);
	
	StringX s;
	iRet=s.countSpace(str);
	
	cout<<"Spaces in the string is "<<iRet;
	return 0;
}