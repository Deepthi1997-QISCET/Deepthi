/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int len=str.length();
		int k=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					k++;
				}
			}
		}
		if(k==0)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}
}
