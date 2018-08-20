/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,m1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n<=10)
		{
			System.out.println(10);
		}
		else
		{
			m=n/10;
			m1=(m+1)*10;
			System.out.println(m1);
		}
	}
}
