#include<iostream>
using namespace std;
class StringX
{
	public:
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
};

int main()
{
	char str[20];

	cout<<"Enter the string \n";
	cin.getline(str,20);
	
	cout<<"Original string is "<<str<<"\n";
	
	StringX s;
	s.strrevX(str);
	
	cout<<"String after the reverse "<<str;
	return 0;
}
