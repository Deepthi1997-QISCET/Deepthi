/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		if(n1>n2)
		{
			System.out.println(n1-n2);
		}
		else
		{
			System.out.println(n2-n1);
		}
	}
}
