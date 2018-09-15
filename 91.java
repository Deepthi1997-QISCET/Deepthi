/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int l,b,h;
		int vol=0;
		int suf=0;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		suf=2*((l*b)+(b*h)+(h*l));
		vol=l*b*h;
		System.out.print(suf+" "+vol);
	}
}
