/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine(),s2="";
		for(int i=0;i<s.length();i++)
		{ 
			if(s.charAt(i)>=65 && s.charAt(i)<=90 )
			{
				s2=s2+String.valueOf(s.charAt(i)).toLowerCase(); 
			}
			else
			{
				s2=s2+String.valueOf(s.charAt(i)).toUpperCase(); 
			}
  	}
  	System.out.println(s2);
	}
}
