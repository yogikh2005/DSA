import java.io.*;
import java.math.*;
import java.security.*;
import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Class Name :        StringX
//  Function Name :     camelcase
//  Description :      	It count the word on the camelcase. Eg. sunGunFun count ->3 sun,Gun,Fun 
//  Input :             String
//  Output :            int
//  Author :            Yogiraj Mohan Khaladkar
//  Date :              21/7/2025
//////////////////////////////////////////////////////////////////////////////////////////////////////////


class StrigX{

    public static int camelcase(String s)
	{
    
    int icnt=1;
    for(int i=0;i<s.length();i++)
    {
        if( s.charAt(i)>='A' && s.charAt(i)<='Z')
            icnt++; 
    }
    return icnt;

}
}

public class CamelCaseWordCount{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
        String s = sc.next();

        int result = StrigX.camelcase(s);

       System.out.println("Word in string is "+result);
	   sc.close();
    }
}
