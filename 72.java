/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int c=0;
		int l=a.length();
		char b[]=a.toCharArray();
		for(int i=0;i<l;i++)
		{
			if((b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')||(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'))
      {
				c=1;
		        break;
			}
		}
		if(c==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
