/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=0;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				n++;
			}
		}
		if(n>2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
