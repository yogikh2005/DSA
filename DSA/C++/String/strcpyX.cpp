#include<iostream>
using namespace std;
class StringX
{
	public:
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
};

int main()
{	
	char str[20];
	char str2[20];
	
	cout<<"Enter the string \n";
	cin.getline(str,20);
	
	StringX s;
	s.strcpyX(str,str2);
	
	cout<<"The original string is "<<str<<"\n";
	cout<<"The copy string is "<<str2;
	
	return 0;
}