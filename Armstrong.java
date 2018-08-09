import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,c=0,a,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
