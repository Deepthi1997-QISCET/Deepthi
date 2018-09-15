/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,p;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			p=n/2;
			System.out.print(p);
		}
		else
		{
			System.out.print(n);
		}
	}
		
}
