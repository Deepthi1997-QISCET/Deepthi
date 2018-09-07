/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=Integer.parseInt(sc.nextLine(), 2);
		String octal=Integer.toOctalString(n);
		System.out.print(octal);
	    
	}
}
