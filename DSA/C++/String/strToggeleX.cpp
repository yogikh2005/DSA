#include<iostream>
using namespace std;
class StringX
{
	public:
	void strToggeleX(char *str)
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
};

int main()
{
	char str[20];
	int iRet=0;
	
	cout<<"Enter the string \n";
	cin.getline(str, 20);
	
	cout<<"Original string is "<<str<<"\n";
	
	StringX s;
	s.strToggeleX(str);
	
	cout<<"String after the toggel case : "<<str;
	return 0;
}