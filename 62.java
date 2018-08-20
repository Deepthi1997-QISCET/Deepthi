/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String d;
		int count=0;
		Scanner s=new Scanner(System.in);
		d=s.next();
		for(int i=0;i<d.length();i++)
		{
			if(d.charAt(i)=='0'||d.charAt(i)=='1')
			{
				count++;
			}
			
		}
		if(count==d.length())
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
			
		}
		
	}
}
