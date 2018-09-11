/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int n=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				n++;
			}
		}
		if(n==s1.length())
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
