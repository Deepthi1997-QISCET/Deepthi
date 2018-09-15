/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int rem=0,sum=0,i,s1=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+(rem);
			n=n/10;
		}
		while(sum>0)
		{
			s1=sum%10;
			if(s1%2==1)
			{
				System.out.print(s1+" ");
				
			}
			sum=sum/10;
		}
	}
}
