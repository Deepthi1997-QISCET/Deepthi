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
		String s=sc.next();
		String x=sc.next();
		int n1=s.length();
		int n2=x.length();
		int i,count=0;
		if(n1<n2)
		{
			for(i=2;i<=n1;i++)
			{
				if(n1%i==0&&n2%i==0)
				{
					count++;
				}
				
			}
		}
		else
		{
			for(i=2;i<=n1;i++)
			{
				if(n1%i==0&&n2%i==0)
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
