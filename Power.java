import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		int res=(int)Math.pow(a,b);
	        System.out.println(res);
	}
}
