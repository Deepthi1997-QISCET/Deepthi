/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i;
		for(i=0;i<s.length();i++)
		{
			char e=s.charAt(i);
			if(e>='a'&&e<='z')
			{
				int a=e-32;
				char d=(char)a;
				System.out.print(d);
			}
			else if(e>='A'&&e<='Z')
			{
				int a=e+32;
				char d=(char)a;
				System.out.print(d);
			}
			else
			{
				System.out.print(e);
			}
		}
	}
}
