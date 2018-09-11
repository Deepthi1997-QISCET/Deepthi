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
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int a3=sc.nextInt();
		int b3=sc.nextInt();
		if((a1==a2)&&(a2==a3))
    {
		System.out.println("yes");
    }
		else if((b1==b2)&&(b2==b3))
    {
		System.out.println("yes");
    }
		else
    {
		System.out.println("no");
    }
	}
}
