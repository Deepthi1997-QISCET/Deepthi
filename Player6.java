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
		String s1=sc.next();
		String s2=sc.nextLine();
		int i,count=0;
		for(i=0;i<(s1.length()-1)&&i<(s2.length()-1);i++)
		{
			if(s1.charAt(i)==s1.charAt(i+1)||s2.charAt(i)==s2.charAt(i+1))
			{
				count=1;
			}
		}
		if(count==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}