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
		String s=sc.nextLine();
		String even="";
		String odd="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				even=even+s.charAt(i);
			}
			else
			{
				odd=odd+s.charAt(i);
			}
		}
		System.out.println(even+" "+odd);
	}
}
