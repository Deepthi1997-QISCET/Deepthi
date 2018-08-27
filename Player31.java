/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player31
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,count=0,count1=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				count++;
			}
			if(s.charAt(i)==')')
			{
				count1++;
			}
		}
		if(count==count1++)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
