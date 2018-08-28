/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		float l,b,f;
		Scanner sc=new Scanner(System.in);
		l=sc.nextFloat();
		b=sc.nextFloat();
		f=l*b;
		String strDouble = String.format("%.5f",f); 
		System.out.println(strDouble);
	}
}
