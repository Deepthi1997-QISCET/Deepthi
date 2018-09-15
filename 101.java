/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int n,m;
		m=sc.nextInt();
		n=s.length();
		for(int i=(n-m);i<n;i++)
		{
		System.out.print(s.charAt(i));
		}
	}
}
